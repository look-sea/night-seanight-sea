package com.itheima.static_app.trait;
/**
 * 静态的特点：
 * 1、被所在类的所有对象共享
 * 2、随着类的加载而加载，优先于对象存在
 * 3、可以通过类名调用
 */
public class StaticDemo {
    //静态成员变量
    static int number=10;
    int num=100;
    static int count =1;
    private String name;//非静态成员变量

    //非静态方法
    public void show(){
        System.out.println("show");
        System.out.println("非静态方法访问非静态变量:"+num);
        System.out.println("非静态方法访问静态变量:"+number);
        this.name="aa";
        System.out.println("非静态方法使用this赋值:"+this.name);
        //在非静态方法中，可以访问静态内容
        System.out.println("非静态方法访问静态方法:");
        print();
        count++;
    }
    public static void print(){
        System.out.println("黑马程序员");

        //静态方法中不能使用this关键字
        //this.name="测试";
    }

    //静态成员方法
    public static void method(){
        System.out.println("静态方法");
    }
}
