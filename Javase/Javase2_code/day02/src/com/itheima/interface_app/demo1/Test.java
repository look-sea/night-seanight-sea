package com.itheima.interface_app.demo1;

public class Test {
    public static void main(String[] args) {
        //创建接口实现类对象
        MyInterfaceImpl mi = new MyInterfaceImpl();
        System.out.println(mi.print("七七"));
    }
}
