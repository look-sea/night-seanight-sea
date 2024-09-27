package com.last.date.calendar;

import java.util.Calendar;

public class CalendarTest3 {
    //演示：Calendar日历类的使用
    public static void main(String[] args) {
        //获取Calendar类对象
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.MONTH));

        //增加一个月
        c.add(Calendar.MONTH , 1);
        System.out.println(c.get(Calendar.MONTH));

        System.out.println(c.get(Calendar.YEAR));
        //减少一年
        c.add(Calendar.YEAR , -1);
        System.out.println(c.get(Calendar.YEAR));

        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        //增加两天
        c.add(Calendar.DAY_OF_MONTH,2);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

    }
}
