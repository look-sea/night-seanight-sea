package com.itheima;

public class A {
    public static void main(String[] args) {
        //常量优化机制:在编译时,如果常量在左边类型的范围内,编译通过,反之报错
        short s = 1;
        //s=s+1;//有int参与运算了,整体结果提升为int,将int赋值给short类型的变量,大->小,报错
        s = (short) (s + 1);//手动强转即可

        short ss = 1;
        ss += 1;//扩展的赋值运算符,隐含了强转
    }
}
