package com.itheima;

//编写代码,实现整数拆分

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        //定义变量
        int num = sc.nextInt();
        //数值拆分
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        //打印结果
        System.out.println("个位是:" + ge);
        System.out.println("十位是:" + shi);
        System.out.println("百位是:" + bai);
    }
}
