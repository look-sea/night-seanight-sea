package homework_day03.t1;

public class Test {
    public static void main(String[] args) {
        Animal cat=new Cat();
        cat.eat();
        //cat.action();//报错//多态的弊端：父引用无法访问子类中特有方法
        if(cat instanceof Cat){
            ((Cat) cat).action();//向下转型
        }
        Animal dog=new Dog();
        dog.eat();
        if(dog instanceof Dog){
            ((Dog) dog).action();//向下转型
        }
        System.out.println("-----------------");
        //子类创建对象时会先调用父类构造方法
        Cat c=new Cat("1",12,"a");
        Dog d=new Dog("1",12,"a");
    }
}
