package com.anycall.member.util;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.FatalBeanException;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BeanUtil {
    private static final String PROPERTY_NAME = "class";

    public BeanUtil() {
    }

    public static void copyProperties(Object fromBean, Object toBean, CopyableInterface copyable) {
        copyPropertiesNative(fromBean, toBean, copyable);
    }

    public static void copyProperties(Object fromBean, Object toBean) {
        copyProperties(fromBean, toBean, new DefaultCopyable());
    }

    private static void copyPropertiesNative(Object source, Object target, CopyableInterface copyable) {
        Assert.notNull(source, "Source must not be null");
        Assert.notNull(target, "Target must not be null");
        Class actualEditable = target.getClass();
        PropertyDescriptor[] targetPds = BeanUtils.getPropertyDescriptors(actualEditable);
        PropertyDescriptor[] var5 = targetPds;
        int var6 = targetPds.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            PropertyDescriptor targetPd = var5[var7];
            Method writeMethod = targetPd.getWriteMethod();
            if (writeMethod != null && copyable.isCopyable(targetPd.getName())) {
                PropertyDescriptor sourcePd = BeanUtils.getPropertyDescriptor(source.getClass(), targetPd.getName());
                if (sourcePd != null) {
                    Method readMethod = sourcePd.getReadMethod();
                    if (readMethod != null && ClassUtils.isAssignable(writeMethod.getParameterTypes()[0], readMethod.getReturnType())) {
                        try {
                            if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
                                readMethod.setAccessible(true);
                            }

                            Object ex = readMethod.invoke(source);
                            if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
                                writeMethod.setAccessible(true);
                            }

                            writeMethod.invoke(target, ex);
                        } catch (Throwable var13) {
                            throw new FatalBeanException("Could not copy property '" + targetPd.getName() + "' from source to target", var13);
                        }
                    }
                }
            }
        }

    }
}
