package homework_day03.t5;

import java.text.SimpleDateFormat;
import java.util.Date;

//获取当前系统的时间，以“xxxx年xx月xx日 xx时xx分xx秒”的格式打印出来。
public class Test2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=new Date();
        String time=sdf.format(date);//Date->String
        System.out.println(time);
    }
}
