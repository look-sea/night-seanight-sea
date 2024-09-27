package com.itheima;

/*
    案例: for循环案例6(回文数)
        打印所有五位数的回文数(无论从左朝右,还是从右朝左,读起来都相同的数)
        并统计回文数的个数
 */
public class Demo06 {
    public static void main(String[] args) {
        System.out.println("所有五位数的回文数有:");
        //定义计数器
        int count = 0;
        //获取范围内数据
       for(int i=10000;i<=99999;i++){
           int ge = i % 10;
           int shi = i / 10 % 10;
           int qian=i/1000%10;
           int wan=i/10000%10;
           //判断是否为回文数
           if(ge==wan&&shi==qian){
               //打印
               System.out.print(i+" ");
               count++;
               //每隔五个数字换行
               if(count%5==0){
                   System.out.println();
               }
           }
       }
        System.out.println("\n一共有"+count+"个");
    }
}