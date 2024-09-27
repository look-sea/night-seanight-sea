package homework_day03.t5;

import java.util.Calendar;
import java.util.Scanner;

//键盘录入一个年份，计算所录入年份的2月份最后一天是几号
public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个年份:");
        String year1=sc.next();
        int year2=Integer.parseInt(year1);//String->int
        Calendar c=Calendar.getInstance();
        c.set(year2,2,1);//设置时间为3月1日
        c.add(Calendar.DAY_OF_MONTH,-1);//将日期减去一天,得到二月最后一天
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
    }
}
