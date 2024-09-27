package practise;

public class Interfacedemo2<T> implements interfaceTest<T>{
    @Override
    public void method1(T a) {
        System.out.println(a);
    }
}
