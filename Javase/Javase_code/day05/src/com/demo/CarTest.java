package com.demo;

public class CarTest {
    public static void main(String[] args) {
        //创建对象
        Car c = new Car();
        //打印默认值
        System.out.println(c.getBrand());
        System.out.println(c.getColor());
        System.out.println(c.getPrice());
        System.out.println("-------------");
        //对象属性赋值
        c.setBrand("红旗");
        c.setColor("白色");
        c.setPrice(180000);
        //调用对象方法
        c.show();
        c.drive();

        //利用带参构造赋值
        Car c2=new Car("奔驰","黑色",400000);
        c2.show();
        c2.drive();
    }
}
