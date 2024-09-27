package homework_day03.t1;

public class Animal {
    private String breed;
    private int age;
    private String sex;
    public void eat(){
        System.out.println("吃");
    }
    public Animal(String breed, int age, String sex) {
        this.breed = breed;
        this.age = age;
        this.sex = sex;
        System.out.println("父类的带参构造方法");
    }

    public Animal() {
        System.out.println("父类的无参构造方法");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
