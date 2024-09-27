package homework_day03.t1;

public class Cat extends Animal{
    public Cat(String breed, int age, String sex) {
        super(breed, age, sex);
        System.out.println("猫类的带参构造方法");
    }

    public Cat() {
        System.out.println("猫类的无参构造方法");
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void action(){
        System.out.println("捉老鼠");
    }
}
