package homework_day06.t1;

import homework_day03.t5.Test1;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

/*利用TreeSet实现以下需求：
        随机生成10个不同的0~50之间的整数，要求按照从小到大进行遍历。
        随机生成10个不同的50~100之间的整数，要求按照从大到小进行遍历。
        思路分析：
        TreeSet是具有排序特性的，默认按照自然排序。如果自然排序满足不了需求，
        可以使用自定义比较器。
        需求1，可以使用自然排序实现；需求2可以使用自定义比较器实现*/
public class Test{
    public static void main(String[] args) {
        Random r=new Random();
        TreeSet<Integer> t1=new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            int random=r.nextInt(51);
            t1.add(random);
        }
        System.out.println(t1);
        TreeSet<Integer> t2=new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return Integer.compare(o1,o2);//升序
                return Integer.compare(o2,o1);//降序
            }
        });
        for (int i = 0; i < 10; i++) {
            int random=r.nextInt(51)+50;
            t2.add(random);
        }
        System.out.println(t2);
    }
}
