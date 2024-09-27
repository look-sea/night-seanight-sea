package homework_day04.t3;

/*请定义学员类，有以下成员属性：
        姓名：String类型 年龄：int
        从控制台接收以下数据：姓名：王哈哈 年龄：24
         以上数据要求全部使用String类型接收
         请创建“学员对象”，并将所有数据转换后，
         存储到这个对象中，最后打印此对象的所有属性。
        思路：
        键盘录入对应学员属性信息，转换为对应的基本数据类型进行设置
        步骤：
        创建学员类
        创建测试类，创建学员对象
        键盘录入属性信息，转换为基本数据类型后设置到学员对象
        打印学员对象信息*/
public class Student {
    private String name;
    private int age;
    private char sex;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex=sex;
    }
}
