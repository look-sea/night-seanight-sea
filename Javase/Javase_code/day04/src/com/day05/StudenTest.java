package com.day05;

import java.util.Random;
import java.util.Scanner;

//测试类
public class StudenTest {
    public static void main(String[] args) {
        //创建学生对象
        Student stu=new Student();
        //打印对象属性
        System.out.println(stu.name);//null默认值
        System.out.println(stu.age);//0默认值
        //给对象赋值
        stu.name="一打七";
        stu.age=23;
        //打印对象属性
        System.out.println(stu.name);
        System.out.println(stu.age);

        //调用对象功能
        stu.eat();

        Student stu2=new Student();
        stu2.name="obt";
        stu2.age=31;
        System.out.println(stu2.name);
        System.out.println(stu2.age);
    }
}
