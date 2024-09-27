package practise.date.datatest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class t2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//创建日期格式化对象,并规定格式
        Date date1=new Date();
        //Date->String
        String time1=sdf.format(date1);
        System.out.println(time1);

        String time2="2020年5月21日 13:14:00";
        //String->Date
        Date date2=sdf.parse(time2);//此处字符串形式必须与SimpleDateFormat规定形式相同
        System.out.println(date2);
    }
}
