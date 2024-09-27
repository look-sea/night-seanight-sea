package practise.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        //创建集合,Collection为接口无法创建对象,故利用多态思想
        Collection<String> coll=new ArrayList();
        coll.add("字符串1");
        coll.add("字符串2");
        coll.add("字符串3");
        System.out.println(coll);
        System.out.println("-------------------");

        coll.remove("字符串3");//移除指定元素
        System.out.println(coll);
        System.out.println("-------------------");

        boolean b1=coll.contains("字符串2");//判断是否包含指定元素
        System.out.println(b1);
        System.out.println("-------------------");

        boolean b2=coll.isEmpty();//判断集合是否为空
        System.out.println(b2);
        System.out.println("-------------------");

        System.out.println(coll.size());//返回集合中元素的个数
        System.out.println("-------------------");

        Object[] s = coll.toArray(new Object[0]);//将集合中的元素存储到数组中
        System.out.println(Arrays.toString(s));


    }
}
