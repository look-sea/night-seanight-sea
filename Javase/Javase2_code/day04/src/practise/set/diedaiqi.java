package practise.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class diedaiqi {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList();
        c.add("字符串1");
        c.add("字符串2");
        c.add("字符串3");
        System.out.println(c);
        //c.get(0);//报错,Collection集合没有索引
        //迭代器
        Iterator<String> iter=c.iterator();
        while(iter.hasNext()){
            String str= iter.next();
            //c.remove("字符串1");//运行会报错,迭代器遍历集合的过程中，不能使用集合对象来增删元素
            if(str.equals("字符串1")) {
                iter.remove();//利用迭代器对象可以删除
            }
        }
        System.out.println(c);
        //System.out.println(iter.next());//运行会报错,迭代器完成集合的遍历后，不能再使用：next()方法
    }
}
