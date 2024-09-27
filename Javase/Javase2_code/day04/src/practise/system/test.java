package practise.system;

public class test {
    public static void main(String[] args) {
        long t1=System.currentTimeMillis();//for循环开始时间
        String s = "";
        for (int i = 1; i <= 50000 ; i++) {
            //完成5万次字符串的拼接 -> 1秒左右
            s += i;
            //System.exit(0);//终止程序
        }
        long t2=System.currentTimeMillis();//for循环结束时间
        System.out.println(t2-t1);//for循环执行时间
    }
}
