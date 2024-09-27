package com.itheima;

/*案例:
    数值拆分
    需求：定义一个三位数，将其拆分为个位、十位、百位后，输出在控制台
    举例： int number = 123 ；
    在控制台输出结果：
    个位是： 3
    十位是： 2
    百位是： 1
    java中两个整数相除,结果只取商
    java中两个整数取余,结果只取余数
*/
public class Demo01 {
    public static void main(String[] args) {
        int number =123;
        int ge=123%10;
        int shi=123/10%10;
        int bai=123/100%10;
        System.out.println("个位是"+ge);
        System.out.println("十位是"+shi);
        System.out.println("百位是"+bai);
    }
}
