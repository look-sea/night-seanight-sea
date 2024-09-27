package practise;

import practise.Clerk;

// Manager.java
public class Manager extends Employee {
    // 属性: 经理的下级职员
    private Clerk clerk;

    // 空参数构造方法
    public Manager() {
    }

    // 满参数构造方法
    public Manager(String name, String workId, String dept, Clerk clerk) {
        super(name, workId, dept);
        this.clerk = clerk;
    }

    // 属性的 set/get 方法
    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    // 重写父类的 showMsg 方法
    @Override
    public void showMsg() {
        System.out.println("经理姓名: " + getName());
        System.out.println("经理工号: " + getWorkId());
        System.out.println("经理部门: " + getDept());
        if (clerk != null) {
            System.out.println("下级职员: " + clerk.getName());
        }
    }
}
