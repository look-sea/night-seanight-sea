package com.itheima;

/*
    案例: for循环案例4(水仙花数)
        水仙花数是一个三位数, 数字每个位置的立方和等于数字本身
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println("100~999之间的水仙花数有:");
        //获取100到999之间的整数
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            //判断数字每个位置的立方和等于数字本身
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                System.out.print(i + " ");
            }
        }
    }
}