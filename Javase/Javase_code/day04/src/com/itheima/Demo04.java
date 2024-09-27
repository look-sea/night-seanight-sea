package com.itheima;

import java.util.Scanner;

/*
    案例: 方法练习(输出较大值) -> 带参数带返回值
        定义方法,接收两个整数,判断较大值并返回
        调用方法接收返回值,并打印
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个值:");
        int a1 = sc.nextInt();
        System.out.println("请输入第二个值:");
        int a2 = sc.nextInt();
        if(a1!=a2) {
            int max = getMax(a1, a2);
            System.out.println("较大值为:"+max);
        }else{
            System.out.println("两者相等");
        }
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else{
            return b;
        }
    }
}

