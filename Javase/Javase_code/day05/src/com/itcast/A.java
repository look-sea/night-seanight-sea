package com.itcast;

//打印this
public class A {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(this);//地址
        this.name = name;
    }
}
