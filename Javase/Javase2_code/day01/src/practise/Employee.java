package practise;

// Employee.java
public abstract class Employee {
    // 私有属性
    private String name;
    private String workId;
    private String dept;

    // 空参数构造方法
    public Employee() {
    }

    // 满参数构造方法
    public Employee(String name, String workId, String dept) {
        this.name = name;
        this.workId = workId;
        this.dept = dept;
    }

    // 属性的 set/get 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    // 抽象方法
    public abstract void showMsg();
}
