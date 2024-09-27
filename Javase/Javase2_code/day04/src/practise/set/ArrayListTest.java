package practise.set;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //创建一个新的集合
        ArrayList arr1=new ArrayList();
        arr1.add("字符串");
        arr1.add(1);
        arr1.add(1.2);
        System.out.println(arr1);
        System.out.println("-------------------");

        //创建一个新的集合,<String>规定集合中数据的类型,<>中只能为对象,第二个<String>可以省略
        //ArrayList<String> arr2=new ArrayList<String>();
        ArrayList<String> arr2=new ArrayList();
        arr2.add("字符串");
        System.out.println(arr2);
        //arr2.add(1);
        //arr2.add(1.2);
        arr2.add("字符串2");//将指定元素添加到此集合末尾
        System.out.println(arr2);
        System.out.println("-------------------");

        arr2.add(1,"中间字符串");//在指定索引处添加字符串
        System.out.println(arr2);
        System.out.println("-------------------");

        String s1=arr2.get(1);//返回指定索引处的元素
        System.out.println(s1);
        System.out.println("-------------------");

        System.out.println(arr2.size());//返回集合中元素的个数
        System.out.println("-------------------");

        String s2=arr2.remove(1);//删除指定索引处的元素,并返回被删除的元素
        System.out.println(s2);
        System.out.println(arr2);
        System.out.println("-------------------");

        boolean b1=arr2.remove("字符串2");//删除指定的元素,并返回是否删除成功
        System.out.println(b1);
        System.out.println(arr2);
        System.out.println("-------------------");

        String s3=arr2.set(0,"字符串1");//修改指定索引处的元素,返回被修改的元素
        System.out.println(s3);
        System.out.println(arr2);

    }
}
