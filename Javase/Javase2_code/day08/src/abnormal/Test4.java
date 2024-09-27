package abnormal;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的姓名:");
            String name = sc.next();
            System.out.println("请输入你的年龄:");
            int age = sc.nextInt();
            try {
                messageprint(name, age);
                break;
            } catch (NullPointerException e) {
                //处理空指针异常
                System.out.println("你的名字不能为空");
            } catch (AgeOutofBoundsException e) {
                //处理自定义异常
                e.printStackTrace();//把异常的错误信息输出在控制台
                System.out.println("你输入的年龄有误");
            }
        }
    }
    public static void messageprint(String name,int age){
        if(name==null||"".equals(name)){
            throw new NullPointerException();
        }
        if(age<0||age>150){
            throw new AgeOutofBoundsException();
        }
        System.out.println("姓名:"+name+",年龄:"+age);
    }
}
