package stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//获取Stream流
public class Test3 {
    //单列集合=>Stream流对象
    public static void method() {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌", "张良", "张三斤", "诸葛亮", "林冲");

        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "宇智波鼬", "千手柱间", "宇智波带土", "长门", "宇智波止水","张三斤");
        //第一个流对象
        Stream<String> stream1=list1.stream();
        //第二个流对象
        Stream<String> stream2=list2.stream();

        //合并流
        Stream<String> newStream=Stream.concat(stream1,stream2);

        newStream
                .distinct()//去除重复元素(流中存储的是对象时,在自定义对象中要重写hashCode,equals方法)
                .forEach((name)-> System.out.println(name));
    }

    public static void main(String[] args) {
        method();
    }
}
