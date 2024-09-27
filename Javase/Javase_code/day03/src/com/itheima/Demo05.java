package com.itheima;

/*
    案例: for循环案例5(统计思想)
        统计有几个水仙花数
 */
public class Demo05 {
    public static void main(String[] args) {
        System.out.println("100~999之间的水仙花数有:");
        //定义用来统计的变量(计数器)
        int count=0;
        //获取100到999之间的整数
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            //判断数字每个位置的立方和等于数字本身
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n一共有"+count+"个");
    }
}