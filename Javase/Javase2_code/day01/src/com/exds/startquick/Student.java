package com.exds.startquick;

//学生
public class Student extends Person{
    public Student(){
        teach1();
        teach2();
        super.teach03();
        teach04();
    }
    public void teach2(){
        System.out.println("zi02");
    }
    public void teach03(){
        System.out.println("zi03");
    }
    public void ss(){
        super.teach03();
    }
}
