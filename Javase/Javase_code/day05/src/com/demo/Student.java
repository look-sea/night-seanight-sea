package com.demo;

/*
学生类
    成员位置在类中方法外

private关键字
    是一个权限修饰符,表示私有的意思,可以修饰成员
    被私有的成员,只能在本类中访问
*/
public class Student {
    //成员变量:类中方法外的变量,必须私有
    private String name;
    private  int age;
    public Student(){}
    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //成员方法:不加static的方法
    public void show(){
        //展示对象所有属性
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
    }
}
