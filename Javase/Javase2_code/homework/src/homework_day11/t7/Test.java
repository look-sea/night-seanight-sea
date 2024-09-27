package homework_day11.t7;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*需求:
        利用转换输入流将当前项目根目录下使用gbk编码的a.txt文件的内容读取出来，并打印在控制台上。
        要求：不能出现乱码的情况。
        思路：
        创建字节输入流对象指定文件路径。
        根据字节输入流对象创建转换输入流对象并指定字符集编码为：gbk
        调用转换输入流对象的读取方法读取内容
        关闭流释放资源*/
public class Test {
    public static void main(String[] args) {
        try (
                InputStreamReader in = new InputStreamReader(new FileInputStream("homework/src/homework_day11/files/a.txt"), "GBK");
        ) {
            //调用转换输入流对象的读取方法读取内容
            int len;
            char[] ch=new char[3];
            while ((len=in.read(ch))!=-1) {
                String s = new String(ch, 0, len);
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
