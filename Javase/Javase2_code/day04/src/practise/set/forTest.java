package practise.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class forTest {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList();
        c.add("字符串1");
        c.add("字符串2");
        c.add("字符串3");
        Iterator<String> it=c.iterator();
        for (String s : c) {
            if(s.equals("字符串1")){
                System.out.println("字符串1");
            }else if(s.equals("字符串2")){
                c.remove("字符串2");
            }else{
                System.out.println("这句永远也不会执行");
                /*原因:第一次遍历类似于访问索引0,条件满足,打印;
                第二次类似访问索引1,也满足,删除"字符串二",
                此时由于少了一个元素类似于最大索引减去1,则相当于最大索引2变成了1;
                而索引1已访问,故跳出循环*/
            }
        }
        System.out.println(c);
    }
}
