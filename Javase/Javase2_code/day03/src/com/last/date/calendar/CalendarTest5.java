package com.last.date.calendar;

import java.util.Calendar;

public class CalendarTest5 {
    //演示：Calendar日历类的使用
    public static void main(String[] args) {
        //获取Calendar类对象
        Calendar c = Calendar.getInstance();
        //计算10天之后的年月日
        c.add(Calendar.DATE , 10);
        System.out.print(c.get(Calendar.YEAR)+"-");
        System.out.print(c.get(Calendar.MONTH)+1+"-");
        System.out.print(c.get(Calendar.DAY_OF_MONTH));
        System.out.println();
        //计算10000天之后的年月日
        c.add(Calendar.DATE , -10+10000);
        System.out.print(c.get(Calendar.YEAR)+"-");
        System.out.print(c.get(Calendar.MONTH)+1+"-");
        System.out.print(c.get(Calendar.DAY_OF_MONTH));
    }
}
