package com.itheima.commons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test2 {
    //FileUitls工具类的使用
    public static void main(String[] args) {
        //源目录
        File src = new File("day12/files");
        //目标目录
        File dest = new File("day12/newfiles");

        //把一个目录下所有文件复制到另一个目录下
        try {
            FileUtils.copyDirectoryToDirectory(src,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
