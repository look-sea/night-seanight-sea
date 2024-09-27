package practise.object;

public class tostringTest {
    String name;
    int age;

    //重写toString()方法
    @Override
    public String toString() {
        return "tostring{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}