package practise;

import java.util.ArrayList;
import java.util.List;

public class wild_card {
    public static void main(String[] args) {
        ArrayList<Number> n=new ArrayList<>();
        ArrayList<Object> o=new ArrayList<>();
        ArrayList<Integer> i=new ArrayList<>();
        ArrayList<String> s=new ArrayList<>();
        method1(n);method1(o);method1(i);method1(s);//method1方法中接受形式为通配符,故所有类的对象都匹配

        method2(n);method2(o);//method2方法中只能是某一类型，及其父类型，其他类型不支持
        //method2(i);method2(s);//报错,Interger为Number的子类,String与Number没关系

        method3(n);method3(i);//method3方法中只能是某一类型，及其子类型，其他类型不支持
        //method3(o);method3(s);//报错,Object为Number的父类,String与Number没关系
    }
    public static void method1(ArrayList<?> list){
    }

    public static void method2(ArrayList<? super Number> list){
    }
    public static void method3(ArrayList<? extends Number> list){
    }
}
