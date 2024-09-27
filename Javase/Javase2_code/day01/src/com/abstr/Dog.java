package com.abstr;

public class Dog extends Animal{
    public Dog() {
        eat();
        drink();
    }
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
