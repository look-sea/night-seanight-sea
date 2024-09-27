package practise;

//自定义泛型类
public class classTest<T> {
    private T num;

    public classTest() {
    }

    public classTest(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }
    public void show(T a){
        System.out.println(a);
    }
}
