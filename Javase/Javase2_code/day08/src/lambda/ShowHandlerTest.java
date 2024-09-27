package lambda;

public class ShowHandlerTest {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("匿名内部类:重写show方法");
            }
        });
        useShowHandler(()->{
            System.out.println("Lambda表达式:重写show方法");
        });
    }
    public static void useShowHandler(ShowHandler handler){
        handler.show();
    }
}
