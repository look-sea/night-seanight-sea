package com.demo;

public class Car {
    //成员变量
    private String brand;
    private String color;
    private double price;
    public Car(){
    }
    public Car(String brand,String color,double price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    //成员方法
    public  void show(){
        System.out.println("品牌:"+brand);
        System.out.println("价格:"+price);
        System.out.println("颜色:"+color);
    }
    public void drive(){
        System.out.println("正在行驶....");
    }
}
