package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,3,2,8,10,5);
        list.stream()
                .sorted()//默认排序方式,自然排序
                .forEach(num-> System.out.print(num+"\t"));
        System.out.println();
        list.stream()
                .sorted((o1,o2)-> o2-o1)//指定了比较器排序
                .forEach(num-> System.out.print(num+"\t"));
    }
}
