package homework_day03.t5;

import java.util.Calendar;

//请编写程序，使用Calendar类获取日历对象，并分别获取年、月、日、小时、分、秒，星期信息并将它们打印到控制台。
public class Test3 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR)+"年");
        System.out.println(c.get(Calendar.MONTH)+1+"月");
        System.out.println(c.get(Calendar.DAY_OF_MONTH)+"日");
        System.out.println(c.get(Calendar.HOUR)+"时");
        System.out.println(c.get(Calendar.MINUTE)+"分");
        System.out.println(c.get(Calendar.SECOND)+"秒");
        switch (Calendar.DAY_OF_WEEK){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
        }
    }
}
