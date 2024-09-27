package com.itheima;

/*
    需求: 根据键盘录入的age, 判断这个人在哪一个范围
        [0-17] 未成年人
        [18-65] 青年人
        [66-79] 中年人
        [80-99] 老年人
        100+ 长寿老人

    键盘对象 Scanner
        1. 导包 import java.util.Scanner; //idea自动导包的,不需要写
        2. 创建对象 Scanner sc = new Scanner(System.in);
        3. 调用方法,接收数据 int num = sc.nextInt();
 */

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        System.out.println("请输入年龄:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 0 && age <= 17) {
            System.out.println("这是一个未成年人");
        } else if (age >= 18 && age <= 65) {
            System.out.println("这是一个青年人");
        } else if (age >= 66 && age <= 79) {
            System.out.println("这是一个中年人");
        } else if (age >= 80 && age <= 100) {
            System.out.println("这是一个老年人");
        } else if (age >= 100) {
            System.out.println("这是一个长寿老人");
        } else {
            System.out.println("输入错误");
        }
    }
}