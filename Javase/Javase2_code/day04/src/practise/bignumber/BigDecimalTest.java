package practise.bignumber;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        //超大浮点数
        BigDecimal b1=new BigDecimal("1.2");//可进行超大浮点数运算,为了验证结果这里取较小的数
        BigDecimal b2=new BigDecimal("1.2");
        BigDecimal b3=new BigDecimal("1.7");

        System.out.println(b1.add(b2));//加
        System.out.println(b1.subtract(b2));//减
        System.out.println(b1.multiply(b2));//乘
        System.out.println(b1.divide(b2));//除
        //System.out.println(b1.divide(b3));//利用此方法除不尽会有异常
        //为了解决上述异常问题,可以加参数,中间参数表示保留位数
        System.out.println(b1.divide(b3,3,BigDecimal.ROUND_HALF_UP));//四舍五入
        System.out.println(b1.divide(b3,3,BigDecimal.ROUND_FLOOR));//去尾法
        System.out.println(b1.divide(b3,3,BigDecimal.ROUND_UP));//进一法
    }
}
