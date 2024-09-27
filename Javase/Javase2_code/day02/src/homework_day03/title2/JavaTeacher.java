package homework_day03.title2;

public class JavaTeacher extends Employee{
    public JavaTeacher(String name, String sex, int age) {
        super(name, sex, age);
    }
    public JavaTeacher(){
    }

    @Override
    public void work() {
        System.out.println("Java工作");
    }
}
