package homework_day06.t9;

import java.util.*;

/*1.利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量
  2.如用户输入字符串:"helloworld java",程序输出结果：
  h(1)e(1)l(3)o(2) (2)w(1)r(1)d(1)j(1)a(2)v(1)
  3.注：输出结果不要求顺序一致*/
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        Set<Map.Entry<Character,Integer>> set=map.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            System.out.print(entry.getKey()+"("+entry.getValue()+")");
        }
    }
}
