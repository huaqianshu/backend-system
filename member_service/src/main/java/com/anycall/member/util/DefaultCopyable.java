package com.anycall.member.util;

public class DefaultCopyable implements CopyableInterface  {
    public DefaultCopyable() {
    }

    public boolean isCopyable(String propertyName) {
        return true;
    }
}
