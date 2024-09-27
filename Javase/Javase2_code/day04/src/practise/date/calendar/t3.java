package practise.date.calendar;

import java.util.Calendar;

public class t3 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        //输出当前月份
        System.out.println(c.get(Calendar.MONTH)+1);
        c.add(Calendar.MONTH,2);//加两个月
        System.out.println(c.get(Calendar.MONTH)+1);

        //输出当前日期
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        c.add(Calendar.DAY_OF_MONTH,-2);//减去两天
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
    }
}
