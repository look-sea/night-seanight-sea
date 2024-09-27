package lambda;

public class StringHandlerTest {
    public static void main(String[] args) {
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println(msg+"的匿名内部类:重写printMessage方法");
            }
        });
        useStringHandler((String msg)->{
            System.out.println(msg+"的Lambda表达式:重写printMessage方法");
        });
        //useStringHandler(msg->System.out.println(msg+"的Lambda表达式:重写printMessage方法"));//省略模式
    }
    public static void useStringHandler(StringHandler handler){
        handler.printMessage("看海");
    }
}
