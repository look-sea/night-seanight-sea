package practise;

// Test.java
public class Test {
    public static void main(String[] args) {
        // 创建职员对象
        Clerk clerk = new Clerk("李小亮", "C001", "销售部", null);

        // 创建经理对象，并将职员对象关联到经理
        Manager manager = new Manager("张小强", "M001", "销售部", clerk);

        // 设置职员的经理
        clerk.setManager(manager);

        // 打印经理和职员的信息
        System.out.println("经理信息:");
        manager.showMsg();

        System.out.println("\n职员信息:");
        clerk.showMsg();
    }
}

