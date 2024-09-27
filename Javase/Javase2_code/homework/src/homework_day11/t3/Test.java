package homework_day11.t3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*请编写main()方法，定义一个字符缓冲输入流BufferedReader，读取Task1_2.txt文件，
一次读取一行，将读取的内容存储到一个List&lt;String>集合中，遍历、并打印集合中的每个元素：
//1.定义一个字符缓冲输入流
BufferedReader in = new BufferedReader(......);
//2.定义一个集合
        List&lt;String&gt; list = new ArrayList&lt;&gt;();
//3.一次读取一行
        ......
        ......*/
public class Test {
    public static void main(String[] args) {
        try (
                BufferedReader in = new BufferedReader(new FileReader("homework/src/homework_day11/files/Task1_2.txt"));
        ) {
            List<String> list=new ArrayList<>();
            String s;
            while ((s=in.readLine())!=null){
                list.add(s);
            }
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
