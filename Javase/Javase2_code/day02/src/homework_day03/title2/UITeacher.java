package homework_day03.title2;

public class UITeacher extends Employee implements Draw{
    public UITeacher(String name, String sex, int age) {
        super(name, sex, age);
    }

    public UITeacher() {
    }

    @Override
    public void work() {
        System.out.println("UI工作");
    }

    @Override
    public void draw() {
        System.out.println("绘画");
    }
}
