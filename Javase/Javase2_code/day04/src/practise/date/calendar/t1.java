package practise.date.calendar;

import java.util.Calendar;

public class t1 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        System.out.print(c.get(Calendar.YEAR)+"年");
        System.out.print(c.get(Calendar.MONTH)+"月");
        System.out.print(c.get(Calendar.DAY_OF_MONTH)+"日 ");
        System.out.print(c.get(Calendar.HOUR)+12+":");
        System.out.print(c.get(Calendar.MINUTE)+":");
        System.out.print(c.get(Calendar.SECOND));
    }
}
