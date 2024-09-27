package com.itheima1.thread.demo7;

class StudentTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "在教授学员游泳");

    }
}
