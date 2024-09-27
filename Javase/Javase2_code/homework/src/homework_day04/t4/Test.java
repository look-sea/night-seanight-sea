package homework_day04.t4;

import java.util.Scanner;

/*键盘录入一段字符串，字符串包含一个学生的姓名，年龄，身高信息。这三个信息以中划线分隔，例如：
        张三-18-180
        1. 录入字符串
        2. 按照 - 切割字符串 {"张三","18","180"}
        3. 把切割后的字符串，作为数据值，填充到学生对象中
        定义学生类包含属性姓名，年龄，身高，将上述字符串转换为学生对象。打印对象，将对象的属性信息显示出来。*/
public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入信息:");
        String s=sc.next();
        String[] ss=s.split("-");
        Student stu=new Student(ss[0],Integer.parseInt(ss[1]),Double.parseDouble(ss[2]));
        System.out.println(stu);
    }
}
