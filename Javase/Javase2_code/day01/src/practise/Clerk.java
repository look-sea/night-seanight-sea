package practise;

// Clerk.java
public class Clerk extends Employee {
    // 属性: 职员的上级经理
    private Manager manager;

    // 空参数构造方法
    public Clerk() {
    }

    // 满参数构造方法
    public Clerk(String name, String workId, String dept, Manager manager) {
        super(name, workId, dept);
        this.manager = manager;
    }

    // 属性的 set/get 方法
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    // 重写父类的 showMsg 方法
    @Override
    public void showMsg() {
        System.out.println("职员姓名: " + getName());
        System.out.println("职员工号: " + getWorkId());
        System.out.println("职员部门: " + getDept());
        if (manager != null) {
            System.out.println("上级经理: " + manager.getName());
        }
    }
}
