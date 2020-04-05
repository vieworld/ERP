package com.warehouse.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayUtils {
    private static Calendar c = Calendar.getInstance();

    public static String getDay(int min) {

        //获取最小时间段

        c.set(c.MONTH, c.get(c.MONTH));

        int minimum = c.getActualMinimum(c.DAY_OF_MONTH);
        c.set(c.DAY_OF_MONTH, minimum + min);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String firstDay = format.format(c.getTime());

        return firstDay;
    }


    public static int getMaxDay() {
        int lastDay = 0;
        c.set(c.MONTH, c.get(c.MONTH));

        if (c.get(c.MONTH) == 1) {
            lastDay = c.getLeastMaximum(c.DAY_OF_MONTH);
        } else {
            lastDay = c.getActualMinimum(c.DAY_OF_MONTH);
        }

        c.set(c.DAY_OF_MONTH, lastDay);

        SimpleDateFormat format = new SimpleDateFormat("dd");

        String s = format.format(c.getTime());

        return Integer.valueOf(s);
    }

    public static String getMonth() {
        c.set(c.MONTH, c.get(c.MONTH));

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        return format.format(c.getTime());
    }

    public static String getYear() {
        c.set(c.MONTH, c.get(c.MONTH));

        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        return format.format(c.getTime());
    }

    public static String getDate() {
        c.getTimeInMillis();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String format1 = format.format(c.getTime());
        return format1;
    }

    public static String DateTransfrom(Date date) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        return format.format(date);
    }


}
