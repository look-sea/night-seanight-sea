package homework_day05.t6;

import java.util.HashSet;

/*请按以下要求顺序编码：
        定义学生类Student，属性：姓名、性别、年龄
        定义测试类，及main()方法
        创建三个Student对象，分别设置以下数据：
        张三,男,20
        李四,女,21
        张三,男,20
        定义一个存储Student类型的HashSet集合，将上述三个对象存储到Set集合中，
        要求集合中不能存储姓名,性别,年龄相同的元素。
        使用增强for遍历集合，获取集合中每个Student对象，并打印属性值；*/
public class Test {
    public static void main(String[] args) {
        HashSet<Student> h=new HashSet<>();
        h.add(new Student("张三",20,"男"));
        h.add(new Student("李四",21,"女"));
        h.add(new Student("张三",20,"男"));
        for (Student student : h) {
            //重写了hashCode()方法,自动去重
            System.out.println(student);
        }
    }
}
