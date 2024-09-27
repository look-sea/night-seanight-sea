package homework_day11.t2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/*请编写main()方法，定义一个存储String的集合：List<String>，并初始化以下数据：
        List&lt;String&gt; list = new ArrayList&lt;&gt;();
        list.add(“迪丽热巴”);
        list.add(“古力娜扎”);
        list.add(“周杰伦”);
        list.add(“蔡徐坤”);
        请定义“字符缓冲输出流”BufferedWriter将集合中的数据写入到文件：Task1_2.txt中，每个名字一行。*/
public class Test {
    public static void main(String[] args) {
        try {
            List<String> list=new ArrayList<>();
            list.add("迪丽热巴");
            list.add("古力娜扎");
            list.add("周杰伦");
            list.add("蔡徐坤");
            BufferedWriter buf=new BufferedWriter(new FileWriter("homework/src/homework_day11/files/Task1_2.txt"));
            for (String s : list) {
                buf.write(s);
                buf.newLine();
            }
            buf.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
