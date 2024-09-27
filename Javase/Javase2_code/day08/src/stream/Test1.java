package stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//获取Stream流
public class Test1 {
    //Stream流的特殊操作:把同一种类型的多个元素,转为Stream流
    public static void method4(){
        Stream<String> stream=Stream.of("yy","oo","pp");
        stream.forEach(name-> System.out.println(name));
        System.out.println(stream);
    }

    //数组=>Stream流对象
    public static void method3(){
        Integer[] array={1,2,3,4,5};
        //获取数组的Stream流对象
        Stream<Integer> stream = Arrays.stream(array);
        stream.forEach(num-> System.out.println(num));
        System.out.println(stream);

    }

    //双列集合=>Stream流对象
    public static void method2(){
        Map<String,String> map=new HashMap<>();
        map.put("1","qq");
        map.put("2","ww");
        //获取Map集合的Stream流对象(不能直接获取)
        //方式1
        /*Set<String> strings = map.keySet();
        Stream<String> stream=strings.stream();*/
        //方式二
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream=entries.stream();
        stream.forEach(name-> System.out.println(name.getKey()+" "+name.getValue()));
    }

    //单列集合=>Stream流对象
    public static void method1(){
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","张良","张三斤","诸葛亮","林冲");
        /*//获取List集合的Stream流对象
        Stream<String> stream1=list.stream();
        //获取"张"开头的名字并打印
        Stream<String> stream2=stream1.filter((name)->{
            return name.startsWith("张");
        });
        stream2.forEach((name)->{
            System.out.println(name);
        });*/
        //简化
        list.stream()
                .filter(name->name.startsWith("张"))
                .forEach(name->System.out.println(name));
    }

    public static void main(String[] args) {
        method4();
    }
}
