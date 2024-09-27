package com.itheima.access_limit.demo1;

public class Son2{
    public void show(){
        Father2 f2=new Father2();
        f2.num=10;//默认权限修饰的变量可以在相同包下访问
    }
}
