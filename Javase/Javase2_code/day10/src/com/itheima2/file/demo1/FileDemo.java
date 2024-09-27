package com.itheima2.file.demo1;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //创建File对象
        File file1 = new File("D:/project/workspace/Javase/Javase2_code/day10/files/HelloWorld.txt");
        File file2 = new File("D:\\project\\workspace\\Javase\\Javase2_code\\day10\\files\\HelloWorld.txt");

        System.out.println(file1.isFile());
        System.out.println(file2.getName());
    }
}
