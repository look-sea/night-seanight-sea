package homework_day05.t2;

import java.util.ArrayList;
import java.util.Iterator;

/*需求：创建一个ArrayList集合，添加5个整数，然后使用不同的方式遍历这些数据。
        自增for循环遍历 //快捷方式： 集合对象.fori
        迭代器遍历 //快捷方式： 获取到迭代器对象后， itit
        增强for循环遍历 //快捷方式： 集合对象for*/
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);arr.add(2);arr.add(4);arr.add(7);arr.add(5);

        //自增for循环遍历并打印
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        //迭代器遍历并打印
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //增强for循环遍历并打印
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
    }
}
