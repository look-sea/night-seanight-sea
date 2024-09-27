package com;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc=new Scanner(System.in);
        //接收字符串1
        System.out.println("请输入一个字符串:");
        String c=sc.next();
        System.out.println("字符串:"+c);
       /* //接收字符串2
        System.out.println("请输入一个字符串:");
        String d=sc.nextLine();
        System.out.println("字符串:"+d);*/
        //接收整数
        System.out.println("请输入一个整数:");
        int a=sc.nextInt();
        System.out.println("整数:"+a);
        //接收小数
        System.out.println("请输入一个小数:");
        double b=sc.nextDouble();
        System.out.println("小数:"+b);
    }
}
