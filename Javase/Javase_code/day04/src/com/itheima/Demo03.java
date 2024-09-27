package com.itheima;

import java.util.Scanner;

/*
    案例: 方法练习(输出较大值) -> 带参数
        定义方法,接收两个整数,判断较大值并打印
        调用方法查看结果
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个值:");
        int a1 = sc.nextInt();
        System.out.println("请输入第二个值:");
        int a2 = sc.nextInt();
        getMax(a1, a2);
    }

    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println("较大值是" + a);
        } else if (a < b) {
            System.out.println("较大值是" + b);
        } else {
            System.out.println("两个值相等");
        }
    }
}
