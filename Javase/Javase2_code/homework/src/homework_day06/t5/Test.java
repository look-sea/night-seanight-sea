package homework_day06.t5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*请按以下要求顺序编码：
        定义一个：键Integer，值String类型的HashMap集合
        存储以下数据：”张三” ,“李四”,“王五”。（put）
        打印集合大小；
        使用“键找值”的方式遍历集合，打印键和值；(keySet)
        使用“键值对”的方式遍历集合，打印键和值；(entrySet)
        获取键为1的值，并打印(get)
        获取键为10的值，并打印
        判断集合中是否有键：10（containsKey）
        删除键为1的键值对，删除完毕打印集合*/
public class Test {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<>();
        h.put(0,"张三");
        h.put(1,"李四");
        h.put(2,"王五");
        System.out.println(h);
        System.out.println("==================================");

        //“键找值”的方式遍历集合，打印键和值
        Set<Integer> s=h.keySet();
        for (Integer integer : s) {
            System.out.println(integer+"="+h.get(integer));
        }
        System.out.println("==================================");

        //使用“键值对”的方式遍历集合，打印键和值
        Set<Map.Entry<Integer,String>> entry=h.entrySet();
        for (Map.Entry<Integer, String> integerStringEntry : entry) {
            Integer key=integerStringEntry.getKey();
            String value=integerStringEntry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("==================================");

        //获取键为1的值，并打印(get)
        System.out.println(h.get(1));
        System.out.println("==================================");

        //获取键为10的值，并打印
        System.out.println(h.get(10));
        System.out.println("==================================");

        //判断集合中是否有键：10（containsKey）
        System.out.println(h.containsKey(10));
        System.out.println("==================================");

        //删除键为1的键值对，删除完毕打印集合
        h.remove(1);
        System.out.println(h);
        System.out.println("==================================");
    }
}
