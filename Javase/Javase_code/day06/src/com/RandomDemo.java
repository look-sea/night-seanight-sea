package com;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        //创建随机数对象
        Random r = new Random();
        //生成随机数
        int num1 = r.nextInt(10);//从0~9的随机数
        int num2 = r.nextInt(10) + 1;//从1~10的随机数
        System.out.println("随机数一:"+num1);
        System.out.println("随机数二:"+num2);
    }
}
