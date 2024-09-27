package com.itheima2.file.demo3;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileDemo6 {
    //演示：获取指定目录下所有的文件
    public static void main(String[] args) {
        //绝对路径
        File file = new File("D:\\project\\workspace\\javase");

        String[] s=file.list();
        for (String s1 : s) {
            System.out.println(s1);
        }
        //获取目录下的所有文件，文件封装为File对象，存储到数组中
        File[] files = file.listFiles();

        for (File f : files) {
            System.out.println(f);
        }
    }
}
