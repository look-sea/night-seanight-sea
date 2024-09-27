package com.itheima;

import java.util.Scanner;

/*
    案例: 方法练习2(比较相等)
        设计一个方法比较两个整数是否相等,返回布尔的结果
        使用不同的方式完成比较(三元,if)
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int a1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int a2 = sc.nextInt();
        boolean b1 = compare1(a1, a2);
        boolean b2 = compare2(a1, a2);
        if (b1 == true) {
            System.out.println("这两个数相同");
        } else {
            System.out.println("这两个数不相同");
        }
        System.out.println("----------------");
        if (b2 == true) {
            System.out.println("这两个数相同");
        } else {
            System.out.println("这两个数不相同");
        }
    }

    //if语句实现
    public static boolean compare1(int a1, int a2) {
        if (a1 == a2) {
            return true;
        } else {
            return false;
        }
    }

    //三元运算符实现
    public static boolean compare2(int a1, int a2) {
        return a1 == a2 ? true : false;
    }
}
