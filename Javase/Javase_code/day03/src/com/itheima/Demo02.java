package com.itheima;

/*
    案例: for循环案例2(求和思想)
        求整数[1-100]的和
 */
public class Demo02 {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;
        //求和
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        //输出
        System.out.println("和为"+sum);
    }
}