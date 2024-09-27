package practise.regularexpression;

//判断是否为手机号(11位,1开头,第二位为3,5,8,之后九位为0-9数字)
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入手机号:");
        String l1=sc.next();
        if(l1.matches("1[356]\\d{9}")){
            System.out.println("手机号格式正确");
        }else{
            System.out.println("手机号格式错误");
        }
    }
}
