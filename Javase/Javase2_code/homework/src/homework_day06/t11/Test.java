package homework_day06.t11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*一个年级有多个班级,每个班级有多个学生,要求保存每个班级对应的学生姓名,
姓名有与之对应的学号,保存年级的所有有信息,班级有对应的班级名称*/
public class Test {
    public static void main(String[] args) {
        Map<String ,Map<String,String>> grade=new HashMap<>();
        //一班
        Map<String,String> class1=new HashMap<>();
        class1.put("aa","001");
        class1.put("bb","002");
        class1.put("cc","003");
        //二班
        Map<String,String> class2=new HashMap<>();
        class2.put("dd","004");
        class2.put("ee","005");
        class2.put("ff","006");
        //三班
        Map<String,String> class3=new HashMap<>();
        class3.put("gg","007");
        class3.put("hh","008");
        class3.put("ii","009");

        grade.put("一班",class1);
        grade.put("二班",class2);
        grade.put("三班",class3);

        Set<String> strings = grade.keySet();
        for (String classroom : strings) {
            Set<Map.Entry<String,String>> student=grade.get(classroom).entrySet();
            for (Map.Entry<String, String> entry : student) {
                System.out.println("班级:"+classroom+",姓名:"+entry.getKey()+",学号:"+entry.getValue());
            }
        }
    }
}
