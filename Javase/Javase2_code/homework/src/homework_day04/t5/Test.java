package homework_day04.t5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*请定义一个Collection类型的集合，存储以下字符串：
        "JavaEE企业级开发指南"
        "Oracle高级编程"
        "MySQL从入门到精通"
        "Java架构师之路"
        请编程实现以下功能：
        使用迭代器遍历所有元素，并打印
        使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
        使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
        如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
        (注意：以上功能写在一个main()方法中，但请单独实现)
        思路分析：
        因为Collection是接口，创建对象需要借助子类型完成
        迭代器使用完后，如果要继续使用需要获取新的
        步骤：
        使用子类型ArrayList定义Collection类型对象
        将字符串数据加到集合中
        按题目要求完成对应业务*/
public class Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();
        c.add("JavaEE企业级开发指南");
        c.add("Oracle高级编程");
        c.add("MySQL从入门到精通");
        c.add("Java架构师之路");
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------------");

        Iterator<String> it1 = c.iterator();
        System.out.println("书名小于10个字符的有:");
        while (it1.hasNext()) {
            String s = it1.next();
            if (s.length() < 10) {
                System.out.println(s);
            }
        }
        System.out.println("------------------");

        Iterator<String> it2 = c.iterator();
        System.out.println("书名中包含“Java”的有:");
        while (it2.hasNext()) {
            String s = it2.next();
            if (s.contains("Java")) {
                System.out.println(s);
            }
        }
        System.out.println("------------------");

        Iterator<String> it3 = c.iterator();
        System.out.println("删除之前:");
        while (it3.hasNext()) {
            String s = it3.next();
            System.out.println(s);
        }
        Iterator<String> it4 = c.iterator();
        while (it4.hasNext()) {
            String s = it4.next();
            if (s.contains("Oracle")) {
                it4.remove();//如果书名中包含“Oracle”，则删掉此书
            }
        }
        Iterator<String> it5 = c.iterator();
        System.out.println("删除之后:");
        while (it5.hasNext()) {
            String s = it5.next();
            System.out.println(s);
        }
    }
}
