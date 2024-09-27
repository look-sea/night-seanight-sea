package com.itheima;
/*
需求:定义变量,进行手机信息描述,打印结果
品牌(brand):vivo
型号(type):iqoo
内存(memory):512G
颜色(color):蓝
价格(price):2399.0
打折后价格:1999.0
*/

public class Demo02 {
    public static void main(String[] args) {
        String brand = "vivo";
        String type = "iqoo";
        int memory = 512;
        char color = '蓝';
        double price = 2399.0;
        System.out.println("你的手机品牌是" + brand + ";\n型号是" + type + ";\n内存为" +
                memory + ";\n颜色是" + color + "色;\n价格为" + price);
        price=1999.0;
        System.out.println("打折后价格为"+price);
    }
}
