package stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//获取Stream流
public class Test2 {
    //单列集合=>Stream流对象
    public static void method(){
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","张良","张三斤","诸葛亮","林冲");
        //中间方法filter,过滤出"张"开头的名字
        list.stream()
                .filter(name->name.startsWith("张"))
                .forEach(name->System.out.println(name));
        System.out.println("--------------------------------");

        //中间方法limit
        list.stream()
                .limit(2)//截取指定个数的数量
                .forEach(name->System.out.println(name));
        System.out.println("--------------------------------");

        //中间方法skip
        list.stream()
                .skip(2)//指定跳过多少个数据
                .limit(2)//截取指定个数的数量
                .forEach(name->System.out.println(name));
    }

    public static void main(String[] args) {
        method();
    }
}
