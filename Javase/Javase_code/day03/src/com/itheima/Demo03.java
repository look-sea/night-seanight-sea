package com.itheima;

/*
    案例: for循环案例3(求偶数和)
        求1到100之间的偶数和
 */
public class Demo03 {
    public static void main(String[] args) {
        //定义求和变量
        int sum01 = 0,sum02=0;
        //获取1到100之间所有整数
       for(int i=1;i<=100;i++){
           if(i%2==0){
               sum01+=i;
           }
       }
        //循环结束,打印结果
        System.out.println("1~100之间的偶数和为:" + sum01);

        for(int i=1;i<=100;i++){
            if(i%2!=0){
                sum02+=i;
            }
        }
        //循环结束,打印结果
        System.out.println("1~100之间的奇数和为:" + sum02);
    }
}