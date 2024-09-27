package practise.packing;

public class Test {
    public static void main(String[] args) {
        //基本类型转为字符串
        String s1=123+"";//1.直接在String类型后面加一个空字符串
        String s2=String.valueOf(123);//2.调用String类静态方法valueof()

        //字符串转为其他类型
        //字符串参数必须对应相应的基本类型
        int num1=Integer.parseInt("1");
        double num2=Double.parseDouble("1.0");
        long num3=Long.parseLong("1");
        short num4=Short.parseShort("1");
        byte num5=Byte.parseByte("1");
        float num6=Float.parseFloat("1");
        boolean num7=Boolean.parseBoolean("true");

        Integer num8=num1;//从int->Interger;这个过程叫自动装箱
        int num9=num8;//从Interger->int;这个过程叫自动拆箱
    }
}
