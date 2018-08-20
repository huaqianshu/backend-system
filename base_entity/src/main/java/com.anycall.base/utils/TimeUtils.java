package com.anycall.base.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by NET on 2017/12/30.
 */
public class TimeUtils {

    private static SimpleDateFormat longFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat shortFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static boolean isWorkingTime(Date date, int minuties) {
        Calendar targetTime = Calendar.getInstance();
        targetTime.setTime(date);
        targetTime.add(Calendar.MINUTE,minuties);
        return isWorkingTime(targetTime.getTime());
    }


    public static boolean isWorkingTime(Date targetTime) {
        try {
            Date onDutyTime = longFormat.parse(shortFormat.format(targetTime) + " 09:00:00");
            Date offDutyTime = longFormat.parse(shortFormat.format(targetTime) + " 18:00:00");
            return (targetTime.getTime() >= onDutyTime.getTime()) && (targetTime.getTime() <= offDutyTime.getTime());
        }catch (Exception e){
            return false;
        }
    }

    public static boolean isSameDate(Date d1, Date d2) {
        return shortFormat.format(d1).equals(shortFormat.format(d2));
    }


    public static Date getNextWorkingTime(Date date, int workingMinutes) {
        Calendar targetTime = Calendar.getInstance();
        targetTime.setTime(date);

        if(isWorkingTime(date)){
            targetTime.add(Calendar.MINUTE, workingMinutes);
            return  targetTime.getTime();
        }else{
            if(targetTime.get(Calendar.HOUR_OF_DAY)>=18){
                targetTime.add(Calendar.DATE, +1);
            }
            targetTime.set(targetTime.get(Calendar.YEAR), targetTime.get(Calendar.MONTH), targetTime.get(Calendar.DAY_OF_MONTH),
                    9, 00, 00);
            return  targetTime.getTime();

        }

    }


}
