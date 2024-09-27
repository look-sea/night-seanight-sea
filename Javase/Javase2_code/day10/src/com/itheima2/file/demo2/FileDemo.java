package com.itheima2.file.demo2;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //相对路径（拿当前项目工程）
        File f = new File("day10/files/HelloWorld.txt");

        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());//获取绝对路径
    }
}
