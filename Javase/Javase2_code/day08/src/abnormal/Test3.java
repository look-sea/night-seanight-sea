package abnormal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入生日(格式:年-月-日):");
            String birthday = sc.next();
            try {
                formatmethod(birthday);
                System.out.println("生日为:"+birthday);
                break;
            } catch (ParseException e) {
                System.out.println("格式错误,请重新输入:");
                System.out.println(e.toString());//把异常类型转为字符串
                e.printStackTrace();//把异常的错误信息输出在控制台(不结束程序运行,只是为了方便调试)
            }
        }
        System.out.println("继续执行");
    }
    public static Date formatmethod(String str) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(str);
    }
}
