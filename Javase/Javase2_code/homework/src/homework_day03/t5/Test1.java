package homework_day03.t5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，
程序要能够计算并打印他来到世界xx天。
注意：“生日”必须早于“当前日期”，否则提示：生日必须早于当前日期！*/
public class Test1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的生日:");
        String birthday=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=sdf.parse(birthday);//String->Date
        Date date2=new Date();
        if (date1.getTime()>date2.getTime()){
            System.out.println("你输入的信息有误");
        }else{
            System.out.println("你已经来到这个世界"+(date2.getTime()-date1.getTime())/1000/60/60/24+"天");
        }
    }
}
