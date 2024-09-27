package com.last.date.calendar;

import java.util.Calendar;

public class CalendarTest2 {
    //演示：Calendar日历类的使用
    public static void main(String[] args) {
       //获取Calendar类对象
        Calendar c  = Calendar.getInstance();
        System.out.println( c.get(Calendar.HOUR) );

        //修改日历中的小时，修改为：8
        c.set(Calendar.HOUR ,8);
        System.out.println(c.get(Calendar.HOUR));

        //修改日历对象中的年月日,时分秒
        c.set(2024,5,20,1,31,4);//月份：0~11
        System.out.println(c);
        System.out.print(c.get(Calendar.YEAR));
        System.out.print(c.get(Calendar.MONTH));
        System.out.print(c.get(Calendar.DAY_OF_MONTH));
        System.out.print(c.get(Calendar.HOUR));
        System.out.print(c.get(Calendar.MINUTE));
        System.out.print(c.get(Calendar.SECOND));
    }
}

