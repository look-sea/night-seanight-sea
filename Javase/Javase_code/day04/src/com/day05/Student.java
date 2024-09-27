package com.day05;

/*
类:对一类具有共同"属性"和"行为"事物的描述
    1.属性->成员变量
    2.行为->成员方法

对象:根据类创建出来的实体
*/
public class Student {
    //1.属性->成员变量
    String name;
    int age;

    //2.行为->成员方法->不带static关键字
    public void eat(){
        System.out.println("学生在吃饭...");
    }
}
