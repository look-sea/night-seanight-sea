package com.itheima2.is;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo2 {
    //演示：字节输入流入门
    public static void main(String[] args) throws IOException {
        //创：创建字节输入流对象，并关联文件
        //InputStream is = new FileInputStream("day10/files/test.txt");//当关联的文件不存在时：运行时异常
        InputStream is = new FileInputStream("day10/files/HelloWorld.txt");//当关联的文件不存在时：运行时异常

        //开始读取数据到字节数组，返回读取的字节数，如果没有数据可读，返回-1
        byte[] bytes=new byte[3];

//        int len1=is.read(bytes);
//        System.out.println("读取了"+len1+"个字节");
//        String s1=new String(bytes);
//        System.out.println(s1);
//
//        int len2=is.read(bytes);
//        System.out.println("读取了"+len2+"个字节");
//        //读出多少就倒出多少
//        String s2=new String(bytes,0,len2);
//        System.out.println(s2);

        int len;
        while ((len=is.read(bytes))!=-1){
            String s=new String(bytes,0,len);
            System.out.print(s);
        }
        //拓展：这种方式读取的性能得到了优化！！但是依然无法避免读取汉字乱码的问题，

        //关：释放资源
        is.close();
    }
}
