package homework_day06.t10;

import java.util.*;

/*需求：一个年级有若干个班级，每个班级有若干个学生；要求：
        学生具有学号、姓名和成绩，学号和学生信息是一一对应的；
        使用集合保存这个年级的所有学生的信息，然后遍历输出；
        思路：
        班级：Map<Integer,Student> 键：学号，值：学生对象
        年级：List<Map<Integer,Student>> 使用List集合将每个班级保存*/
public class Test {
    public static void main(String[] args) {
        //创建年级对象
        List<Map<Integer,Student>> list=new ArrayList<>();

        //创建第一个班级
        Map<Integer,Student> map1=new HashMap<>();
        map1.put(111,new Student("aa",61));
        map1.put(222,new Student("bb",62));
        map1.put(333,new Student("cc",63));

        // 创建第二个班级
        Map<Integer,Student> map2=new HashMap<>();
        map2.put(444,new Student("dd",64));
        map2.put(555,new Student("ee",65));

        // 创建第三个班级
        Map<Integer,Student> map3=new HashMap<>();
        map3.put(666,new Student("ff",66));
        map3.put(777,new Student("gg",67));
        map3.put(888,new Student("hh",68));

        //将班级加到年级集合里
        list.add(map1);list.add(map2);list.add(map3);

        for (Map<Integer, Student> map : list) {
            Set<Integer> set=map.keySet();
            for (Integer integer : set) {
                System.out.println("学号:"+integer+" "+map.get(integer));
            }
        }
    }
}