package com.itheima2.os;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStreamDemo4 {
    //演示：字节输出流的入门
    public static void main(String[] args) throws IOException {
        //创建：字节输出流对象，并关联一个文件（如文件不存在，则创建新文件）,第二个参数表示追加输入,不会覆盖掉原文件
        OutputStream os = new FileOutputStream("day10/files/hello.txt",true);

        //操作：写数据
        os.write('a');
        os.write(97);
        os.write("\t\n".getBytes());

        String s1="我爱你中国10-1";
        byte[] bytes=s1.getBytes();
        os.write(bytes);
        os.write("\t\n".getBytes());

        //参数一：字节数组
        //参数二：写出去的第一个字节的索引
        //参数三：总共写出去多少个字节
        byte[] bytes2=s1.getBytes();
        os.write(bytes2,0,9);

        //关闭：释放资源
        os.close();
    }
}
