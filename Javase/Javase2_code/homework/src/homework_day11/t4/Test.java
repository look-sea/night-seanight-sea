package homework_day11.t4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*请按以下要求编写程序：
        定义一个学员类，有以下 属性：姓名、性别、年龄、分数
        无参、全参构造方法，get/set方法
        定义main()方法，定义一个存储Student的集合，并初始化一些数据：
        List&lt;Student&gt; stuList = new ArrayList&lt;&gt;();
        stuList.add(new Student(“迪丽热巴”,”女”,18,99);
        stuList.add(new Student(“古力娜扎”,”女”,19,98);
        stuList.add(new Student(“周杰伦”,”男”,20,88);
        stuList.add(new Student(“蔡徐坤”,”男”,19,78);
        定义一个字符缓冲输出流BufferedWriter，将学员信息写入到”test1_4.txt”中，每个学员信息占一行，每个字段之间用,符号隔开，例如：
        迪丽热巴,女,18,99
        古力娜扎,女,19,98
        周杰伦,男,20,88
        蔡徐坤,男,19,78*/
public class Test {
    public static void main(String[] args) {
        try {
            List<Student> stuList=new ArrayList<>();
            stuList.add(new Student("迪丽热巴","女",18,99));
            stuList.add(new Student("古力娜扎","女",19,98));
            stuList.add(new Student("周杰伦","男",20,88));
            stuList.add(new Student("蔡徐坤","男",19,78));
            BufferedWriter buf=new BufferedWriter(new FileWriter("homework/src/homework_day11/files/test1_4.txt"));
            for (Student student : stuList) {
                String str=student.getName()+","+student.getSex()+","+student.getAge()+","+student.getScore();
                buf.write(str);
                buf.newLine();
            }
            buf.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
