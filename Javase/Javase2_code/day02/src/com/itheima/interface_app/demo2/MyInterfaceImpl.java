package com.itheima.interface_app.demo2;

//接口实现类： 实现多个接口
public class MyInterfaceImpl  implements MyInterfaceA , MyInterfaceB{
    @Override
    public void show() {
        System.out.println("你好七七");
    }

    @Override
    public int getData() {
        return 10000;
    }
    //重写所实现接口中所有的抽象方法
}
