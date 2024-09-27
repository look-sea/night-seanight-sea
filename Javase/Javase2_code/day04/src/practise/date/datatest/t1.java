package practise.date.datatest;

import java.util.Date;

public class t1 {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());//打印输出1970年1月1日到现在的时间,毫秒为单位
        Date date1=new Date(1726287241267L);//将时间(毫秒为单位)赋值给date1,得到的时间为初始值加上该值
        System.out.println(date1);
        Date date2=new Date();
        date2.setTime(1726287241267L);//将时间(毫秒为单位)赋值给date2,得到的时间为初始值加上该值
        System.out.println(date2);
    }
}
