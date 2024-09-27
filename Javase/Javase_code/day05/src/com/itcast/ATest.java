package com.itcast;

//测试this
public class ATest {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a);//地址
        a.setName("qq");
        /*
        打印结果相同
        说明方法被哪个对象调用,this就代表那个对象
        */
    }
}
