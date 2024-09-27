package com.itheima;

import java.util.Scanner;

/*
        需求:
        定义一个方法,打印[1-n]之间所有的奇数

 */
public class MethoDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值:");
        int n = sc.nextInt();
        System.out.println("1-" + n + "之间的奇数有:");
        print(n);
    }

    public static void print(int a) {
        int count = 0;
        if (a < 1) {
            System.out.println("输入有误");
        } else {
            for (int i = 1; i <= a; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    count++;
                    //隔五个换行
                    if (count % 5 == 0)
                        System.out.println();
                }
            }
            System.out.println("\n一共有"+count+"个");
        }
    }
}
