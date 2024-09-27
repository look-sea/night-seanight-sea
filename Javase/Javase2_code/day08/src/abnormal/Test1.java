package abnormal;

public class Test1 {
    public static void main(String[] args) {
        method("aaa");
    }
    /*public static void method(String name) throws NullPointerException,IndexOutOfBoundsException{
        //可能会发生空指针异常NullPointerException
        System.out.println(name.length());

        //可能发生索引越界异常IndexOutOfBoundsException
        System.out.println(name.charAt(100));
    }*/

    //直接抛出父类(运行时异常)
    public static void method(String name) throws RuntimeException{
        //可能会发生空指针异常NullPointerException
        System.out.println(name.length());

        //可能发生索引越界异常IndexOutOfBoundsException
        System.out.println(name.charAt(100));
    }
}
