package homework_day03.title6;

/*创建一个类学生类，定义属性姓名，年龄，性别。要求性别使用枚举类型只能是男或者女两种值。

        创建测试类，定义两个学生对象，设置属性值如下：

        姓名：小明，年龄：18，性别：男
        姓名：小红，年龄：19，性别：女
        要求：枚举名使用Sex，枚举常量名 BOY表示男，Girl表示女。*/
public class Test {
    public static void main(String[] args) {
        Student stu1=new Student("小明",18,Sex.BOY);
        Student stu2=new Student("小红",19,Sex.GIRL);
        stu1.show();
        stu2.show();
    }
}
