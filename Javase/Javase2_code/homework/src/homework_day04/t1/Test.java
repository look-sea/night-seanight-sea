package homework_day04.t1;

/*有以下double数组：
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
        请编程计算它们的总值及平均值(四舍五入保留小数点后2位)
        思路：
        定义一个BIgDecimal变量用来接收总和
        遍历将数组元素都转换为BigDecimal，并累加到总和
        打印总和
        计算平均值，打印平均值
遍历double类型的数组，对数组中的所有元素求和
平均值 =  总和 / 数组长度*/

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
        BigDecimal sum=new BigDecimal(0);
        for (int i = 0; i < arr.length; i++) {
            sum=sum.add(new BigDecimal(arr[i]+""));
        }
        System.out.println("总和为:"+sum);
        BigDecimal len=new BigDecimal(arr.length+"");
        BigDecimal average=sum.divide(len,2,BigDecimal.ROUND_HALF_UP);
        System.out.println("平均值:"+average);
    }
}
