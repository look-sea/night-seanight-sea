package com.itheima;
/*
    案例: 减肥计划, 每周7天每一天对应一个运动
 */
public class Demo07 {
    public static void main(String[] args) {
        //减肥计划 -> 每周7天每一天对应一个运动
        int week = 3; //星期3
        //week = 8; //如果接收到了错误数据, 提供else备胎语句
        if(week==1){
            System.out.println("星期一:吃饭");
        }else if(week==2){
            System.out.println("星期二:吃饭");
        }else if(week==3){
            System.out.println("星期三:吃饭");
        }else if(week==4){
            System.out.println("星期四:吃饭");
        }else if(week==5){
            System.out.println("星期五:吃饭");
        }else if(week==6){
            System.out.println("星期六:吃饭");
        }else if(week==7){
            System.out.println("星期日:吃饭");
        }else{
            System.out.println("输入错误");
        }
    }
}