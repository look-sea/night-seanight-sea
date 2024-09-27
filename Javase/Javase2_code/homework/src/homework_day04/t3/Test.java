package homework_day04.t3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名:");
        String n=sc.next();
        System.out.println("请输入年龄:");
        String a=sc.next();
        System.out.println("请输入性别:");
        String s=sc.next();
        //将字符串类型进行转换传入到Student对象中
        Student stu=new Student(n,Integer.parseInt(a),s.charAt(0));
        System.out.println(stu);//重写了toString方法
    }
}
