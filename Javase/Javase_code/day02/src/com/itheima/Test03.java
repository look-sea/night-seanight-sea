package com.itheima;

//输入一个整数,判断奇偶性

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("它是偶数");
        }else if(num%2!=0){
            System.out.println("它是奇数");
        }
    }
}
