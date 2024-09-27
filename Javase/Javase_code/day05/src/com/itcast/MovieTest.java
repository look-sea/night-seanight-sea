package com.itcast;

//电影测试类
public class MovieTest {
    public static void main(String[] args) {
        //空参构造并赋值和打印
        Movie m1=new Movie();
        m1.setName("战狼");
        m1.setType("战争");
        m1.setDirector("吴京");
        m1.show();
        System.out.println("------------");
        //带参构造并赋值和打印
        Movie m2=new Movie("战狼2","战争动作","吴京..");
        m2.show();
    }
}
