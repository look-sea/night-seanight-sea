package com.itheima2.os;

import java.io.*;

public class OutputStreamDemo5 {
    //演示：字节输出流的入门
    public static void main(String[] args){
        try {
            //创建：字节输出流对象，并关联一个文件（如文件不存在，则创建新文件）,第二个参数表示追加输入,不会覆盖掉原文件
            InputStream is=new FileInputStream("day10/files/hello.txt");
            OutputStream os = new FileOutputStream("day10/files/newhello.txt");
            byte[] bytes=new byte[1024];
            int len;

            while ((len=is.read(bytes))!=-1) {
                String s=new String(bytes,0,len);
                System.out.println(s);
                bytes=s.getBytes();
                os.write(bytes);
            }
            //关闭：释放资源
            os.close();
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
