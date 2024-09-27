package practise.polymorphism.t1;

public class Cat extends Animal {
    String name = "猫";
    String sound = "喵喵";

    @Override
    public void show() {
        System.out.println("小猫游泳");
    }

    public void jiao() {
        System.out.println("小猫" + sound);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
