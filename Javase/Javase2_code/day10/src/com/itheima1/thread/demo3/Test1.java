package com.itheima1.thread.demo3;

import com.itheima1.thread.demo3.ThreadTask1;

public class Test1 {
    public static void main(String[] args) {
        //创建线程对象（包含：线程任务）
        ThreadTask1 task = new ThreadTask1();
        //启动线程
        task.start();


        for (int i = 100; i < 200; i++) {
            System.out.println("main方法："+i);
        }
    }
}
