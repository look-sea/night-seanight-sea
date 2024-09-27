package homework_day05.t7;

import java.util.LinkedHashSet;

/*请按以下要求顺序编码：
        定义一个可以存储“整数”的LinkedHashSet对象
        存储以下整数: 20,30,50,10,30,20
        打印集合大小。为什么跟存入的数量不一致？
        使用增强for遍历集合，打印大于25的元素*/
public class Test {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l=new LinkedHashSet<>();
        l.add(20);l.add(30);l.add(50);l.add(10);l.add(30);l.add(20);
        System.out.println(l.size());
        for (Integer integer : l) {
            if(integer>25) {
                System.out.print(integer + " ");
            }
        }
    }
}
