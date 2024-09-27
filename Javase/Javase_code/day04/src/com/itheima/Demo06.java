package com.itheima;

//方法重载演示
public class Demo06 {
    public static void main(String[] args) {
        System.out.println(getSum(1,2)+" "+getSum(1,2,3)+" "+getSum(1.0,2.0));
    }
    public static int getSum(int a,int b){
        return a+b;
    }
    public static int getSum(int a,int b,int c){
        return a+b+c;
    }
    public static double getSum(double a,double b){
        return a+b;
    }
}
