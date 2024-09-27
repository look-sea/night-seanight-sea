package com.day05;

/*
    电脑类
        品牌
        价格
        颜色
        内存
*/
public class Computer {
    //成员变量
    String brand;
    double price;
    String color;
    int memory;
    //成员方法
    public void PlayGames(){
        System.out.println("打游戏");
    }
    //成员方法->展示对象属性
    public void show(){
        System.out.println("品牌:"+brand);
        System.out.println("价格:"+price);
        System.out.println("颜色:"+color);
        System.out.println("内存:"+memory);
    }
}
