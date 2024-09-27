package com.demo;

/*
构造方法格式:
    public 方法名(){

        }
    构造方法作用:创建对象

    注意事项:
        1.方法名必须和类名一致
        2.每new一次对象,自动执行一次
        3.带参构造的本质,就是在创建对象的同时,完成赋值
        4.推荐两种构造都提供,java允许方法重载
*/
public class Teacher {
    private String name;
    private int age;
    //构造方法
    public Teacher(){
        System.out.println("空参构造执行了");
    }
    public Teacher(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("带参构造执行了");
        System.out.println("姓名:"+this.name+","+"年龄:"+age);
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
