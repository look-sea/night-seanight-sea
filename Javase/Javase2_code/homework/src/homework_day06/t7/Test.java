package homework_day06.t7;

import java.util.HashMap;
import java.util.HashSet;

/*需求：研发部门有5个人，信息如下：（姓名-工资）
【柳岩=2100, 张亮=1700, 诸葛亮=1800, 灭绝师太=2600, 东方不败 =3800】,
将以上员工的相关信息存放在适合的集合中,给柳岩涨工资300,迭代出每个元素的内容输出到控制台。
        思路：
        使用HashMap存储数据
        使用put方法进行对新增或者修改数据*/
public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("柳岩",2100);
        map.put("张亮",1700);
        map.put("诸葛亮",1800);
        map.put("灭绝师太",2600);
        map.put("东方不败",3800);
        System.out.println(map);
        map.put("柳岩",map.get("柳岩")+300);
        System.out.println(map);
    }
}
