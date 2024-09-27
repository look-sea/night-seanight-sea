package homework_day03.t2;

public class Test {
    public static void main(String[] args) {
        Programmer p=new Programmer(5000,"李小亮");
        Manager m=new Manager(9000,"张小强");
        Company c=new Company(1000000);
        c.pay(p);
        c.pay(m);
    }
}
