package homework_day03.t2;

public class Company implements Money{
    @Override
    public void pay(Employee e) {
        money=money-e.getSalary();
        System.out.println("给"+e.getName()+"发工资"+e.getSalary()+"元,公司剩余:"+money+"元");
    }

    private double money;

    public Company(double money) {
        this.money = money;
    }

    public Company() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
