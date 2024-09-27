package homework_day11.t5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*请编写main()方法，定义一个字符缓冲输入流BufferedReader对象，读取”test1_4.txt”文件，一次读取一行，
将每行数据封装为一个Student对象，并将Student对象存储到一个集合。遍历并打印集合的所有Student信息。
        //定义一个BufferedReader对象
        BufferedReader in = new BufferedReader(......);
        //定义一个集合
        List&lt;Student&gt; stuList = new ArrayList&lt;&gt;();
        //一次读取一行
        ......*/
public class Test {
    public static void main(String[] args) {
        try (
                BufferedReader in = new BufferedReader(new FileReader("homework/src/homework_day11/files/test1_4.txt"));
        ) {
            List<Student> stuList=new ArrayList<>();
            String str;
            while ((str=in.readLine())!=null){
                String[] s=str.split(",");
                stuList.add(new Student(s[0],s[1],Integer.parseInt(s[2]),Integer.parseInt(s[3])));
            }
            for (Student student : stuList) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
