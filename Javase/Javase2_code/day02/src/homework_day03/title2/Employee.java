package homework_day03.title2;

/*请定义“员工(类)”： 属性：姓名、性别、年龄(全部私有) 行为：工作(抽象) 无参、全参构造方法 get/set方法

        请定义“绘画(接口)” 抽象方法：绘画

        请定义“Java讲师类”继承自“员工类”

        请定义”UI讲师类”，继承自“员工类”，并实现“绘画”接口。

        要求：

        请按上述要求设计出类结构，并实现相关的方法。
        测试类中创建对象测试，属性可自定义：
        创建一个Java讲师类对象，调用工作的方法。
        创建一个UI讲师类对象，调用工作方法，和绘画方法。*/
public abstract class Employee {
    private String name;
    private String sex;
    private int age;

    public Employee() {
    }

    public abstract void work();

    public Employee(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
