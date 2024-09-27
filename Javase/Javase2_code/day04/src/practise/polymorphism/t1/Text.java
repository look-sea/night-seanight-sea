package practise.polymorphism.t1;

public class Text {
    public static void main(String[] args) {
        Animal cat = new Cat();

        System.out.println(cat.name);//父类与子类存在相同变量时,调用父类变量
        //System.out.println(cat.sound);//报错,父类没有的变量不会去子类中查找
        System.out.println("------------------");

        cat.show();//父类与子类存在相同方法时,调用子类方法
        //cat.jiao();//父类没有的方法不会去子类中查找
        cat.play();//子类中没有的方法会去父类中查找
        ((Cat) cat).jiao();//通过向下转型可以调用子类中的方法;这行代码与以下两行代码等价
        //Cat cat1=(Cat) cat;
        //cat1.jiao();
        System.out.println("------------------");

        Animal c=new Cat();
        sleep(c);
        System.out.println("======");
        Animal d=new Dog();
        sleep(d);

        /*
        Animal c1=new Cat();
        sleep(c1);
        public static void sleep(Animal animal){
             //Dog d=(Dog) animal;//运行报错,实质是将猫类型转为狗类型,类型不一致
        }
        */
    }
    public static void sleep(Animal animal){
        animal.show();//父类与子类存在相同方法时,调用子类方法
        if(animal instanceof Cat){
            Cat c=(Cat) animal;//向下转型可调用子类特有方法
            c.jiao();
        }else if(animal instanceof Dog){
            Dog d=(Dog) animal;//向下转型可调用子类特有方法
            d.jiao();
        }

    }

}
