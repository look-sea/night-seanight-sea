package com.itheima;

/*
    案例: while循环案例1(求奇数和)
        求1到100之间的奇数和
 */
public class Demo08 {
    public static void main(String[] args) {
        //定义求和变量
        int sum1=0,sum2=0;
        int i=1;
        while(i<=100){
            if(i%2!=0){
                sum1+=i;
            }else{
                sum2+=i;
            }
            i++;
        }
        System.out.println("1~100之间的奇数和为:"+sum1);
        System.out.println("1~100之间的偶数和为:"+sum2);
    }
}