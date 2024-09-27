package com.itheima.access_limit.demo1;

public class Son1 {
    public void show(){
        Father1 f1=new Father1();
        f1.count=10;//protected修饰的变量可以在相同包下访问
    }
}
