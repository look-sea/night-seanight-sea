package com.day05;

//手机测试类
public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        Phone p1=new Phone();
        Phone p2=new Phone();
        //给对象赋值
        p1.brand="华为";
        p1.price=7988.0;
        p1.color="蓝色";
        //调用对象功能
        p1.call("一打七");
        p1.sendMessage();
        //给对象赋值
        p2.brand="小米";
        p2.price=4988.0;
        p2.color="黑色";
        //打印对象属性
        p1.show();
        p2.show();
        //调用对象功能
        p2.call("哦比头");
        p2.sendMessage();
    }
}
