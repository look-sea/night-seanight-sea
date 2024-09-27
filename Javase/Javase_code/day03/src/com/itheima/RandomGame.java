package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
    Random随机数对象:
        1. 导包 import java.util.Random;
        2. 创建对象 Random r = new Random();
        3. 调用方法,接收数据 int num = r.nextInt(数据);
         //范围取值: 从0到指定数据,包含0,不包含指定数据

    猜数字小游戏:
        使用Random随机数对象, 生成一个[1-100]之间的整数, 作为正确答案
        使用Scanner, 提示用户录入猜的数据并接收, 使用if语句判断用户猜的结果, 打印对应提示
            情况1: 猜的数超出了[1-100]的范围! 请重新输入!
            情况2: 猜大了
            情况3: 猜小了
            情况4: 恭喜你!猜对了
 */
public class RandomGame {
    public static void main(String[] args) {
        boolean j=true;
        //实现可以多次游戏
        while (j==true) {
            System.out.println("请输入您要猜的数字:");
            //创建随机数对象
            Random r = new Random();
            //创建键盘输入对象
            Scanner sc = new Scanner(System.in);
            //规定随机数范围,并给出范围内的一个正确答案
            int num = r.nextInt(100) + 1;
            //键盘录入数据
            int i = sc.nextInt();
            //执行循环体
            while (i != num) {
                //判断结果
                if (i < num&&i>0) {
                    System.out.println("您猜小了!");
                } else if(i>num&&i<=100){
                    System.out.println("您猜大了!");
                }else{
                    System.out.println("您输入的数字有误");
                }
                System.out.println("请输入您要猜的数字:");
                i = sc.nextInt();
            }
            System.out.println("恭喜您,猜对了!");
            System.out.println("------------------");
            System.out.println("您还想继续玩吗?(true/false)");
            j=sc.nextBoolean();
        }
        System.out.println("程序退出");
    }
}