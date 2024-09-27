package homework_day05.t5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*请编写main()方法，按以下要求顺序：
        定义一个Set集合，并存储以下数据：刘备,关羽,张飞,刘备,张飞
        打印集合大小
        使用迭代器遍历集合，并打印每个元素
        使用增强for遍历集合，并打印每个元素*/
public class Test {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        s.add("刘备");
        s.add("关羽");
        s.add("张飞");
        s.add("刘备");
        s.add("张飞");
        System.out.println(s.size());

        //使用迭代器遍历集合，并打印每个元素
        Iterator<String> it=s.iterator();
        while (it.hasNext()) {
            String next =  it.next();
            System.out.print(next+" ");
        }
        System.out.println();

        //使用增强for遍历集合，并打印每个元素
        for (String s1 : s) {
            System.out.print(s1+" ");
        }
    }
}
