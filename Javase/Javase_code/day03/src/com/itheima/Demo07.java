package com.itheima;

/*
    案例: for循环案例7 (逢七过)
        在整数1到1000中,个位不能是7,十位不能是7,百位不能是7,并且该数不能是7的倍数
        打印满足条件的数据

    扩展: 一行打印5个,使用空格分开
        System.out.println(); //打印并换行
        System.out.print(); //一行打印
 */
public class Demo07 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;
        //获取1到1000之间的整数
        for (int i = 1; i <= 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            //判断
            if (ge != 7 && shi != 7 && bai != 7 && i % 7 != 0) {
                System.out.print(i + " ");
                count++;
                //一行打印5个
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}