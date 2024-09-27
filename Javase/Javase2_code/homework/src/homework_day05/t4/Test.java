package homework_day05.t4;

import java.util.ArrayList;

/*需求：
        定义一个学生类Student，包含三个属性姓名、年龄、性别，
        私有成员变量,生成无参，有参构造方法，生成get/set方法。
        创建三个学生对象存入ArrayList集合中。
        找出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
        遍历集合输出对象属性信息。（输出格式如：姓名：张三, 年龄：23, 性别：男）*/
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> arr=new ArrayList<>();
        Student s1=new Student("熊大",24,"男");
        Student s2=new Student("熊二",23,"男");
        Student s3=new Student("翠花",23,"女");
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        Student max=arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if(max.getAge()<arr.get(i).getAge()){
                max=arr.get(i);
            }
        }
        max.setName("小猪佩奇");
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}
