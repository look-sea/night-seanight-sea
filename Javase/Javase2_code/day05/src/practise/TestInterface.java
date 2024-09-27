package practise;

public class TestInterface {
    public static void main(String[] args) {
        Interfacedemo1 i=new Interfacedemo1();
        i.method1("aa");

        Interfacedemo2<Integer> i2=new Interfacedemo2<>();
        i2.method1(2);


    }
}
