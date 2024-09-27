package com.day05;

//电脑测试类
public class ComputeTest {
    public static void main(String[] args) {
        //创建对象
        Computer c1 = new Computer();
        Computer c2=new Computer();
        //给对象赋值
        c2.brand="联想";
        c2.price=3499.0;
        c2.color="银色";
        c2.memory=256;
        //打印对象属性
        c1.show();//默认值
        System.out.println("-----------");
        c2.show();
        //调用对象方法
        c1.PlayGames();
    }
}
