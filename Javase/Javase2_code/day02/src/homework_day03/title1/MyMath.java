package homework_day03.title1;

/*定义一个数学工具类，类名使用MyMath.
        要求：
        该工具类不能有子类，不接受扩展。
        该工具类不能被外界创建对象，构造方法需要私有化。
        定义静态常量：PI,用来保存圆周率：3.14。
        定义静态方法max,获取两个整数的较大值。
        定义静态方法min,获取两个整数的较小值。*/
public final class MyMath {
    private MyMath() {
    }

    public static final double PI = 3.14;

    //获取两个整数的较大值
    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    //获取两个整数的较小值
    public static int getMin(int a, int b) {
        return a < b ? a : b;
    }
}
