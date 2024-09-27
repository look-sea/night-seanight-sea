package practise.polymorphism.t1;

public class Dog extends Animal{
    public String name="狗";
    public String sound="汪汪";
    @Override
    public void show(){
        System.out.println("小狗游泳");
    }

    public void jiao(){
        System.out.println("小狗"+sound);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
