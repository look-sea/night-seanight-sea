package homework_day06.t1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

// 先按照年龄降序排序，如果年龄相同，再按照姓名降序排序
public class Test2 {
    public static void main(String[] args) {
        //自然排序Comparable的使用
        TreeSet<Student> t=new TreeSet<>();
        t.add(new Student("aa", 24));
        t.add(new Student("aa", 22));
        t.add(new Student("ss", 22));
        t.add(new Student("bb", 24));
        Iterator<Student> it = t.iterator();
        while (it.hasNext()) {
            Student next = it.next();
            System.out.println(next);
        }
        System.out.println("================");

        //比较器排序
        TreeSet<Student> t1=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int n= o1.getName().compareTo(o2.getName());//名字升序
                if(n!=0){
                    return n;
                }
                return o2.getAge()-o1.getAge();//如果名字相同,年龄降序
            }
        });
        t1.add(new Student("aa", 24));
        t1.add(new Student("aa", 22));
        t1.add(new Student("ss", 22));
        t1.add(new Student("bb", 24));
        for (Student student : t1) {
            System.out.println(student);
        }
    }
}