package com.abstr;

public class Cat extends Animal{
    public Cat(){
        eat();
        drink();
    }
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
