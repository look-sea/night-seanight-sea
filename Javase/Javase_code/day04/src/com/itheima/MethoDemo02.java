package com.itheima;

import java.util.Scanner;

//需求1:定义方法,判断一个整数的奇偶性
//需求2:定义方法,计算三个整数的平均值并返回
//需求3:定义方法,判断有几个水仙花数并返回
public class MethoDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //判断一个整数的奇偶性
        System.out.println("请输入一个整数:");
        int a1 = sc.nextInt();
        jiou(a1);
        System.out.println("-------------------");

        //计算三个整数的平均值
        System.out.println("请输入第一个数:");
        double b1 = sc.nextDouble();
        System.out.println("请输入第二个数:");
        double b2 = sc.nextDouble();
        System.out.println("请输入第三个数:");
        double b3 = sc.nextDouble();
        double ave = average(b1, b2, b3);
        System.out.println("这三个数的平均值为:" + ave);
        System.out.println("-------------------");

        //判断有几个水仙花数
        System.out.println("请输入您想要判断的范围(100~999):");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        if (c1 > c2 || c1 < 100 || c2 > 1000) {
            System.out.println("您输入的范围有误");
        } else {
            int count = flower(c1, c2);
            System.out.println("\n"+c1 + "~" + c2 + "之间的水仙花数有" + count + "个");
        }
    }

    public static void jiou(int a1) {
        if (a1 % 2 == 0) {
            System.out.println("这个数是偶数");
        } else {
            System.out.println("这个数是奇数");
        }
    }

    public static double average(double b1, double b2, double b3) {
        return (b1 + b2 + b3) / 3;
    }

    public static int flower(int c1, int c2) {
        int count = 0;
        System.out.println(c1 + "和" + c2 + "之间的水仙花数有");
        for (int i = c1; i <= c2; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                System.out.print(i + " ");
                count++;
            }
        }
        return count;
    }
}
