package homework_day06.t1;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //自然排序Comparable的使用
    @Override
    public int compareTo(Student stu) {
        int n= this.name.compareTo(stu.name);//名字升序
        if(n!=0){
            return n;
        }
        return stu.age-this.age;//如果名字相同,年龄降序
    }
}
