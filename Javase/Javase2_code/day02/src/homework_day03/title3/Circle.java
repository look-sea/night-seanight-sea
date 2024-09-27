package homework_day03.title3;
/*编写一个接口ShapePara，要求： 接口中的方法：
        int getArea()：获得图形的面积
        int getCircumference()：获得图形的周长
        编写一个圆类Circle，要求：圆类Circle实现接口ShapePara。
        该类含有一个静态常量：
        PI： double类型，值为3.14
        该类包含有成员变量：
        radius:	public修饰的double类型radius,表示圆的半径。
        包含的方法有：
        Circle(double radius) 有参构造方法。
        double getRadius()：获取半径为方法的返回值。 void setRadius(double radius)：利用形参表中的参数设置类Circle的radius域。
        请根据上述要求代码实现相关类和接口，并定创建测试类，定义一个圆对象。半径为10，求周长和面积。
        注： 圆周长公式： 周长 = 2*PI*radius
        圆面积公式： 面积 = PI * radius*radius*/
public class Circle implements ShapePara{
    private static final double PI=3.14;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2*PI*radius;
    }

    @Override
    public double getArea(){
        return PI*radius*radius;
    }
}
