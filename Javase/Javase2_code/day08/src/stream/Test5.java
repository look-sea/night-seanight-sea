package stream;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,3,2,8,10,5);
        //求最大值
        Optional<Integer> max=list.stream().max((num1, num2)->num1-num2);
        System.out.println("MAX:"+max);

        //求最小值
        Optional<Integer> min=list.stream().min((num1, num2)->num1-num2);
        System.out.println("MIN:"+min);

        //获取流中元素个数
        System.out.println(list.stream().filter(num->num%2==0).count());

        list=list.stream().filter(num->num%2==0).collect(Collectors.toList());//把流对象中的元素收集到List集合
        System.out.println(list);

        Integer[] array=list.stream().filter(num->num%2==0).toArray(value -> new Integer[value]);
        System.out.println(Arrays.toString(array));
    }
}
