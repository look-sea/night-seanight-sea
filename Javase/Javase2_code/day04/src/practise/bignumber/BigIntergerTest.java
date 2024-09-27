package practise.bignumber;

import java.math.BigInteger;

public class BigIntergerTest {
    public static void main(String[] args) {
        //超大整数
        BigInteger b1=new BigInteger("10");//可进行超大数运算,为了验证结果这里取较小的数
        BigInteger b2=new BigInteger("10");
        System.out.println(b1.add(b2));//加法
        System.out.println(b1.subtract(b2));//减法
        System.out.println(b1.multiply(b2));//乘法
        System.out.println(b1.divide(b2));//除法//b2为"0"时,运行会发生异常
        //以上方法计算的结果，都是一个新的BigInteger对象
    }
}
