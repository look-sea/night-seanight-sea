package lambda;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int num1= sc.nextInt();
        System.out.println("请输入第二个整数:");
        int num2= sc.nextInt();
        useCalculator(new Calculator() {
            @Override
            public int calc(int num1, int num2) {
                return num1+num2;
            }
        },num1,num2);

        useCalculator((int num01, int num02)->{
            return num01+num02;
        },num1,num2);
        //useCalculator((num01, num02)->num01+num02,num1,num2);//省略模式
    }
    public static void useCalculator(Calculator calculator,int num1,int num2){
        System.out.println("和为:"+calculator.calc(num1,num2));
    }
}
