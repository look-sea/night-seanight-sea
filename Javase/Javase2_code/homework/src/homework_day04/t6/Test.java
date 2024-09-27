package homework_day04.t6;

import java.util.ArrayList;
import java.util.Collection;

/*请定义一个Collection类型的集合，存储以下分数信息：
        88.5,39.2,77.1,56.8,89,99,59.5
        请编程实现以下功能：
        使用增强for遍历所有元素，并打印
        使用增强for遍历所有元素，打印不及格的分数；
        使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
        使用增强for遍历所有元素，求出最高分，并打印；
        (注意：以上所有功能写在一个main()方法中，但请单独实现)*/
public class Test {
    public static void main(String[] args) {
        Collection<Double> coll = new ArrayList<>();
        coll.add(88.5);
        coll.add(39.2);
        coll.add(77.1);
        coll.add(56.8);
        coll.add(89d);////集合中是Double，int不能自动转为Double.整数后面加d表示该数是double数据
        coll.add(99d);
        coll.add(59.5);
        for (Double num : coll) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("------------------------");

        //打印不及格的分数
        for (Double num : coll) {
            if (num < 60) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------");

        //计算不及格的分数的数量，和平均分，并打印计算结果
        int count = 0;
        double sum = 0;
        for (Double num : coll) {
            if (num < 60) {
                count++;
            }
            sum += num;
        }
        double average=sum/coll.size();
        System.out.println("不及格的分数的数量为:" + count + ",平均分为:" + average);
        System.out.println("------------------------");

        //求出最高分，并打印
        double max = 0;
        for (Double num : coll) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("最大值为:"+max);
    }
}
