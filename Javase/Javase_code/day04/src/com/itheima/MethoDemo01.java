package com.itheima;

import java.util.Scanner;

/*
    需求:
        定义一个方法,接收三个整数,获取中间值并打印
        通过键盘获取三个整数,作为参数传递调用方法
*/
public class MethoDemo01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int a1=sc.nextInt();
        System.out.println("请输入第二个数:");
        int a2=sc.nextInt();
        System.out.println("请输入第三个数:");
        int a3=sc.nextInt();
        mid01(a1,a2,a3);
        mid02(a1,a2,a3);
    }
    public static void mid01(int a1,int a2,int a3){
        if(a1<=a2&&a1<=a3){
            if(a2<=a3){
                System.out.println("中间数是:"+a2);
            }else{
                System.out.println("中间数是:"+a3);
            }
        }else if(a2<=a1&&a2<=a3){
            if(a1<=a3){
                System.out.println("中间数是:"+a1);
            }else{
                System.out.println("中间数是:"+a3);
            }
        }else{
            if(a1<=a2){
                System.out.println("中间数是:"+a1);
            }else{
                System.out.println("中间数是:"+a2);
            }
        }
    }
    public static void mid02(int a1,int a2,int a3){
        //判断中间值并打印->mid=sum-max-min
        int max=(a1>a2?a1:a2)>a3?(a1>a2?a1:a2):a3;
        int min=(a1<a2?a1:a2)<a3?(a1<a2?a1:a2):a3;
        int mid=a1+a2+a3-max-min;
        System.out.println("中间数是:"+mid);
    }
}
