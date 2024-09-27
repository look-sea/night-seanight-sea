package practise.object;


import java.util.Objects;

public class test {
    public static void main(String[] args) {
        //测试toString
        tostringTest to =new tostringTest();
        to.name="七七";
        to.age=12;
        System.out.println(to);

        //测试equals()
        equalsTest t1=new equalsTest("七七",12);
        equalsTest t2=new equalsTest("七七",12);
        System.out.println(t1==t2);//false,比较地址
        System.out.println(t1.equals(t2));//比较内容

        //测试Objects工具类
       equalsTest t3=new equalsTest();
        equalsTest t4=new equalsTest("七七",12);
        t3=null;
        //System.out.println(t3.equals(t4));//Object类的equals方法会报空指针异常
        System.out.println(Objects.equals(t3,t4));
    }
}