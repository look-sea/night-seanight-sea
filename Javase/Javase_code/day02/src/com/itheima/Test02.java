package com.itheima;

//在三个整数变量中求出最小值并打印

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a1=sc.nextInt();
        System.out.println("请输入第二个整数:");
        int a2=sc.nextInt();
        System.out.println("请输入第三个整数:");
        int a3=sc.nextInt();
        //1.if语句实现
        /*if(a1<a2&&a1<a3){
            System.out.println("最小值为:"+a1);
        }else if(a2<a3&&a2<a1){
            System.out.println("最小值为:"+a2);
        }else{
            System.out.println("最小值为:"+a3);
        }*/

        //2.三元运算符实现
        int temp=a1<a2?a1:a2;
        int min=temp<a3?temp:a3;
        //扩展
        //int min=(a1<a2?a1:a2)<a3?(a1<a2?a1:a2):a3?
        System.out.println("最小值为:"+min);
    }
}
