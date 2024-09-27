package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    SimpleDateFormat可以对Date对象, 进行格式化和解析

    日期模式字符串中,字母的对应关系
        y   年
        M   月
        d   日
        H   时
        m   分
        s   秒

    SimpleDateFormat构造方法
        public SimpleDateFormat(); 构造一个SimpleDateFormat对象, 使用默认格式
        public SimpleDateFormat(String 格式); 构造一个SimpleDateFormat对象,使用指定格式

    SimpleDateFormat成员方法
        格式化 public final String format(Date date); 格式化为指定格式
        解析 public Date parse(String source); 从指定格式解析为日期对象
 */
public class DateDemo03 {
    public static void main(String[] args) throws ParseException {
        //Date -> String

        //创建日期格式化对象
        //SimpleDateFormat sdf=new SimpleDateFormat();
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化Date对象
        String s1 = sdf.format(new Date());
        System.out.println(s1);
        /*
             空参,默认格式 2024/9/10 上午12.57
             带参,指定格式1 2024年09月10日 01:00:33
             带参,指定格式2 2024-09-10 01:03:09
         */

        System.out.println("--------------------");
        //创建日期格式化对象
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //解析String -> Date
        Date date1=sdf1.parse("2024年09月10日 01:00:33");
        System.out.println(date1);//老外看的格式

        System.out.println("---------------------");
        //创建日期格式化对象
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2=sdf2.parse("2024-09-10 01:03:09");
        System.out.println(date2);

    }
}