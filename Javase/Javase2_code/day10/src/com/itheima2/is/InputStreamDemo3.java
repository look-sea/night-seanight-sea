package com.itheima2.is;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo3 {
    //演示：字节输入流入门
    public static void main(String[] args) throws IOException {
        //创：创建字节输入流对象，并关联文件
        //InputStream is = new FileInputStream("day10/files/test.txt");//当关联的文件不存在时：运行时异常
        InputStream is = new FileInputStream("day10/files/HelloWorld2.txt");//当关联的文件不存在时：运行时异常
        File file=new File("day10/files/HelloWorld2.txt");

//        //定义一个字节数组与文件大小一样大
//        byte[] bytes=new byte[(int)file.length()];
//        int len=is.read(bytes);
//        String s=new String(bytes);
//        System.out.println("文件大小:"+file.length());
//        System.out.println("读取的字节数:"+len);
//        System.out.println(s);

        //Java已经为我们提供了一次性读完文件的全部字节到一个字节数组中返回给我们
        byte[] bytes=is.readAllBytes();
        String s=new String(bytes);
        System.out.println(s);

        //关：释放资源
        is.close();
    }
}
