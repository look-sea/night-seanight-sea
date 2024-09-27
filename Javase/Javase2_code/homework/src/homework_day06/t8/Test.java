package homework_day06.t8;

import java.util.LinkedHashMap;
import java.util.Set;

/*需求：使用LinkedHashMap保存学生对象，及其对应的家庭住址；要求：
        学生具有学号、姓名和成绩三个属性；
        其中，学号不能重复；
        思路：
        要重写hashCode和equals方法，学号不能重复，只要选中学号即可。
        步骤：
        定义学生类包含学号、姓名和成绩三个属性；
        重写hashCode和equals方法，选中学号即可
        定义LinkedHashMap对象，键是学生对象，值是地址
        创建学生对象存入数据
        遍历查看结果*/
public class Test {
    public static void main(String[] args) {
        LinkedHashMap<Student,String> map=new LinkedHashMap<>();
        map.put(new Student("133","小明",90),"北京");
        map.put(new Student("233","小红",95),"上海");
        map.put(new Student("333","小明",92),"广州");
        map.put(new Student("133","小青",91),"深圳");
        Set<Student> s=map.keySet();
        for (Student student : s) {
            System.out.println(student+" 地址:"+map.get(student));
        }
    }
}
