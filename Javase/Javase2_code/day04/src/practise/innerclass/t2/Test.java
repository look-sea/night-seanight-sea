package practise.innerclass.t2;

public class Test{
    public static void main(String[] args) {
        new Flyable(){
            @Override
            public void fly(){
                System.out.println("飞飞飞飞飞飞");
            }

        }.fly();
        Flyable f=new Flyable() {
            @Override
            public void fly() {
                System.out.println("飞不动了");
            }
        };
        f.fly();
        showFlyable(
                new Flyable() {
                    @Override
                    public void fly() {
                        System.out.println("又起飞了");
                    }
                }
        );
        getFlyable().fly();
    }
    // 方法，参数是接口类型
    public static void showFlyable(Flyable flyable) {
        flyable.fly();
    }
    // 方法的返回值类型是接口类型
    public static Flyable getFlyable() {
        return new Flyable() {
            @Override
            public void fly() {
                System.out.println("坠机");
            }
        };
    }
}
