package com.itheima;

import java.util.Scanner;

/*
    需求: 使用程序,判断一个整数的奇偶数,打印结果
 */
public class Demo08 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        System.out.println("请输入一个整数:");
        int num=new Scanner(System.in).nextInt();
        if(num%2==0){
            System.out.println("这是一个偶数");
        }else{
            System.out.println("这是一个奇数");
        }
    }
}