package com.itheima.access_limit.demo2;

import com.itheima.access_limit.demo1.Father1;

public class Son1 extends Father1 {
    public void show(){
        this.count=100;//如果没有继承Father1类则不可使用count变量,说明不同包下protected修饰的变量权限只能在子类子类中访问
    }
}
