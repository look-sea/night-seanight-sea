package homework_day05.t3;

import java.util.ArrayList;

/*需求：定义一个方法 int listTest(ArrayList<Integer> list, Integer num)，
要求实现返回num在list里面第一次出现的索引，如果num没出现过返回-1。
        String类       indexOf("it")
        int index = "itheima".indexOf("it");*/
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(11);arr.add(22);arr.add(33);arr.add(129);
        int index=listTest(arr,129);
        System.out.println(index);
    }
    public static int listTest(ArrayList<Integer> list, Integer num){
        for (int i = 0; i < list.size(); i++) {
            //Integer类中存在一种设计模式:享元模式
            //提前把-128~127存储在常量池中
            //if(num==list.get(i)){return i;}//针对包装类对象，使用equals比较,==针对于不在-128~127范围内的数据会返回错误结果
            if(num.equals(list.get(i))){
                return i;
            }
        }
        return -1;
    }
}
