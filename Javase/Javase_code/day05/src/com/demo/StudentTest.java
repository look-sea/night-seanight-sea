package com.demo;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        Student s=new Student();
        //打印属性,默认值
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println("-------------");
        s.show();
        System.out.println("-------------");
        //赋值并打印
        s.setName("aaa");
        s.setAge(16);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println("-------------");
        s.show();
        System.out.println("-------------");

        //利用带参构造赋值并打印
        Student s2=new Student("bbb",20);
        s2.show();
    }
}
