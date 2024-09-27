package homework_day03.t4;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("aa",18);
        Student s2=new Student("aa",18);
        //由于Student类重写了toString方法,故打印对象是不再是地址值
        System.out.println(s1);
        //由于Student类重写了equals方法,故只要属性值相同就认为对象相同
        System.out.println(s1.equals(s2));
    }
}
