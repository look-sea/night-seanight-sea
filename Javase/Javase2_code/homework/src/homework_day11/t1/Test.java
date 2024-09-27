package homework_day11.t1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*请将一个视频文件复制到不同路径下，例如：d:\视频.itcast，复制到 E:\视频.itcast。
请使用“字节缓冲流”：BufferedInputStream和BufferedOutputStream实现*/
public class Test {
    public static void main(String[] args) {
        try (
                BufferedInputStream bin = new BufferedInputStream(new FileInputStream("homework/files/t_01.mp4"));
                BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("homework/src/homework_day11/files/newt_01.mp4"));
        ) {
            byte[] bytes=new byte[1024];
            int len;
            long begin=System.currentTimeMillis();
            while ((len=bin.read(bytes))!=-1) {
                bout.write(bytes, 0, len);
            }
            long end=System.currentTimeMillis();
            System.out.println("复制完成,用时:"+(end-begin)+"毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
