package practise.date.calendar;

import java.util.Calendar;

public class t4 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();

        //当前日期
        System.out.print(c.get(Calendar.YEAR)+"年");
        System.out.print(c.get(Calendar.MONTH)+1+"月");//外国月份0-11,所以加1
        System.out.print(c.get(Calendar.DAY_OF_MONTH)+"日\n");
        //打印10000天之后的日期
        c.add(Calendar.DAY_OF_MONTH,10000);
        System.out.print(c.get(Calendar.YEAR)+"年");
        System.out.print(c.get(Calendar.MONTH)+1+"月");//外国月份0-11,所以加1
        System.out.print(c.get(Calendar.DAY_OF_MONTH)+"日\n");
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH,-10000);//恢复当前日期
        System.out.print(c.get(Calendar.YEAR)+"年");
        System.out.print(c.get(Calendar.MONTH)+1+"月");//外国月份0-11,所以加1
        System.out.print(c.get(Calendar.DAY_OF_MONTH)+"日\n");

        //打印2052年1月31日是周几
        c.set(2052,0,31);
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}
