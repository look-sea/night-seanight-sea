package homework_day11.t6;

import java.io.*;

/*需求:
        现有一字符串：”我爱Java”。将该字符串保存到homework/src/homework_day11/files目录下的a.txt文件中。
        要求：使用gbk编码保存。
        注意：idea的默认编码是utf-8, 所以可以通过file -> settings -> file encodings设置为gbk格式，
        否则打开a.txt文件看到的将会是乱码。
        思路：
        创建文件字节输出流关联目标文件
        根据文件字节输出流创建转换输出流对象，并指定编码字符集为：gbk
        调用流对象的方法将字符串写出到文件中。
        关闭流并释放资源。*/
public class Test {
    public static void main(String[] args) {
        try (
                FileOutputStream ou1 = new FileOutputStream("homework/src/homework_day11/files/a.txt");
                OutputStreamWriter ou2 = new OutputStreamWriter(ou1,"gbk");
        ) {
           ou2.write("我爱Java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
