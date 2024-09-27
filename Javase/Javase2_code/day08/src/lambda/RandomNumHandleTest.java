package lambda;

import java.util.Random;

public class RandomNumHandleTest {
    public static void main(String[] args) {
        Random r=new Random();
        useRandomNumHandle(new RandomNumHandler() {
            @Override
            public int getNumber() {
                return r.nextInt(101);
            }
        });
        useRandomNumHandle(()->{
            return r.nextInt(101);
        });
    }
    public static void useRandomNumHandle(RandomNumHandler handler){
        System.out.println(handler.getNumber());
    }
}
