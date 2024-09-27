package practise;

public class TestClass {
    public static void main(String[] args) {
        classTest<String> c=new classTest<>();//指定类型为String
        c.setNum("aa");
        c.show(c.getNum());
        classTest<Integer> d=new classTest<>();//指定类型为Interger
        d.setNum(11);
        d.show(d.getNum());

    }
}
