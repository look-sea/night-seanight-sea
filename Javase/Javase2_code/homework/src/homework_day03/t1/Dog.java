package homework_day03.t1;

public class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
    }

    public Dog() {
        System.out.println("狗类的无参构造方法");
    }

    public Dog(String breed, int age, String sex) {
        super(breed, age, sex);
        System.out.println("狗类的无参构造方法");
    }

    public void action(){
        System.out.println("看家");
    }
}
