package homework.t5;

import com.itheima.jdbc.util.JdbcUtil;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*1.在数据库创建部门表和员工表，包含字段如下：
        部门表包含字段有：部门编号，部门名称(唯一且不能为空)
        员工表包含字段有：员工编号，员工姓名(唯一且不能为空)，员工性别，员工职位，员工工资，入职日期。部门编号(外键)
2.先添加多个部门数据，再添加多条员工数据
3.编写方法接收一个员工编号和工资两个参数，方法内将指定编号的员工工资修改为新的工资。
4.编写方法查询指定职位所有员工的信息，返回List<Employee>集合。
5.编写方法查询指定姓名的员工信息，返回Employee对象。
6.编写方法根据员工姓名删除指定的员工信息。
7.编写方法查询所有姓张员工的工资并输出在控制台，输出格式如下：
        张三=10000
        张飞=20000
8.编写方法接收一个工资参数，方法内查询工资大于等于传入的工资的员工，返回符合条件所有员工信息List<Employee>集合。
9.编写方法查询指定部门的所有员工信息，返回List<Employee>集合*/
public class Test01 {
    public static void main(String[] args) {
        try {
            // 创建表
            createTable();
            // 添加部门数据
            addDept();
            // 添加员工数据
            addEmployees();
            // 修改id=2的员工工资为16000
            updateSalary(2, 16000);
            // 获得所有员工信息
            List<Employee> employees = findAllEmployee();
            for (Employee employee : employees) {
                System.out.println(employee);
            }
            // 查询name为林青霞的员工信息
            Employee e = findEmployeeByName("林青霞");
            System.out.println(e);

            // 删除name为林青霞的员工
            System.out.println(deleteByName("林青霞"));

            //查询所有姓张员工的工资并输出在控制台
            querySalarys();

            // 8.查询工资大于8000的员工
            List<Employee> employees2 = findEmployeeBySalary(8000);
            for (Employee employee : employees2) {
                System.out.println(employee);
            }
            // 9.编写方法查询指定部门的所有员工信息，返回List<Employee>集合
            List<Employee> employees3 = findEmployeeByDeptName("产品部");
            for (Employee employee : employees3) {
                System.out.println(employee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //9.编写方法查询指定部门的所有员工信息，返回List<Employee>集合
    public static List<Employee> findEmployeeByDeptName(String deptName) throws SQLException {
        Connection conn = JdbcUtil.getConnection();
        String sql = "select employee.id,name,gender,post," +
                "salary,edate,deptid from dept,employee where dept_name=? and deptid=dept.id;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,deptName);
        ResultSet rs = ps.executeQuery();
        List<Employee> list = new ArrayList<>();
        while(rs.next()){
            list.add(new Employee(rs.getInt("employee.id"),
                    rs.getString("name"),
                    rs.getString("gender"),
                    rs.getString("post"),
                    rs.getDouble("salary"),
                    rs.getDate("edate"),
                    rs.getInt("deptid")));
        }
        JdbcUtil.close(conn, ps);
        return list;
    }

    //8.编写方法接收一个工资参数，方法内查询工资大于等于传入的工资的员工，返回符合条件所有员工信息List<Employee>集合。
    public static List<Employee> findEmployeeBySalary(double salary) throws SQLException {
        Connection conn = JdbcUtil.getConnection();
        String sql = "select id,name,gender,post,salary,edate,deptid from employee where salary>?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setDouble(1, salary);
        ResultSet rs = ps.executeQuery();
        List<Employee> list = new ArrayList<>();
        while (rs.next()) {
            list.add(new Employee(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("gender"),
                    rs.getString("post"),
                    rs.getDouble("salary"),
                    rs.getDate("edate"),
                    rs.getInt("deptid")));
        }
        JdbcUtil.close(conn, ps);
        return list;
    }

    //7.编写方法查询所有姓张员工的工资并输出在控制台
    public static void querySalarys() throws SQLException {
        Connection conn = JdbcUtil.getConnection();
        String sql = "select name,salary from employee where name like '张%';";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("name") + ":" + rs.getDouble("salary"));
        }
        JdbcUtil.close(conn, ps);
    }

    //6.编写方法根据员工姓名删除指定的员工信息。
    public static boolean deleteByName(String name) throws SQLException {
        Connection conn = JdbcUtil.getConnection();
        String sql = "delete from employee where name=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        int row = ps.executeUpdate();
        JdbcUtil.close(conn, ps);
        if (row != 0) {
            return true;
        } else {
            return false;
        }
    }

    //5.编写方法查询指定姓名的员工信息，返回Employee对象。
    public static Employee findEmployeeByName(String name) throws SQLException {
        Connection conn = JdbcUtil.getConnection();
        String sql = "select id,name,gender,post,salary,edate,deptid from employee where name=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        Employee e = null;
        while (rs.next()) {
            e = new Employee(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("gender"),
                    rs.getString("post"),
                    rs.getDouble("salary"),
                    rs.getDate("edate"),
                    rs.getInt("deptid"));
        }
        JdbcUtil.close(conn, ps);
        return e;
    }

    //4.编写方法查询所有员工的信息，返回List<Employee>集合。
    public static List<Employee> findAllEmployee() throws SQLException {
        Connection conn = JdbcUtil.getConnection();
        String sql = "select id,name,gender,post,salary,edate,deptid from employee;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Employee> list = new ArrayList<>();
        while (rs.next()) {
            list.add(new Employee(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("gender"),
                    rs.getString("post"),
                    rs.getDouble("salary"),
                    rs.getDate("edate"),
                    rs.getInt("deptid")));
        }
        JdbcUtil.close(conn, ps, rs);
        return list;
    }

    //3.编写方法接收一个员工编号和工资两个参数，方法内将指定编号的员工工资修改为新的工资。
    public static void updateSalary(int id, double salary) throws SQLException {
        Connection conn = JdbcUtil.getConnection();
        String sql = "update employee set salary=? where id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setDouble(1, salary);
        ps.setInt(2, id);
        ps.executeUpdate();
        JdbcUtil.close(conn, ps);
    }

    //2.先添加多个部门数据，再添加多条员工数据//如果先添加员工数据,会报关联错误
    public static void addEmployees() throws SQLException {
        Connection conn = JdbcUtil.getConnection();
        String sql = "insert into employee(name,gender,post,salary,edate,deptid) "
                + "values('张三','男','Java研发工程师',9000,'2016-10-10',1),"
                + "('林青霞','女','销售经理',15000,'2015-06-15',2),"
                + "('李四','男','产品经理',10000,'2014-12-11',3),"
                + "('张三丰','男','Android研发工程师',8000,'2017-05-26',1);";
        // 获得PreparedStatement对象
        PreparedStatement ps = conn.prepareStatement(sql);
        // 执行SQL语句
        int row = ps.executeUpdate();
        System.out.println(row);
        // 关闭资源
        JdbcUtil.close(conn, ps);
    }

    public static void addDept() throws SQLException {
        Connection conn = JdbcUtil.getConnection();
        String sql = "insert into dept(dept_name) values('研发部'),('销售部'),('产品部');";
        ;
        // 获得PreparedStatement对象
        PreparedStatement ps = conn.prepareStatement(sql);
        // 执行SQL语句
        int row = ps.executeUpdate();
        System.out.println(row);
        // 关闭资源
        JdbcUtil.close(conn, ps);
    }

    //1.创建部门表和员工表
    public static void createTable() {
        try {
            Connection con = JdbcUtil.getConnection();
            String sql1 = "create table dept(id int primary key auto_increment,dept_name varchar(20) unique not null);";
            String sql2 = "create table employee(id int primary key auto_increment,name varchar(20) unique not null, gender varchar(2),post varchar(20),salary double,edate date,deptid int, constraint foreign key(deptid) references dept(id));";
            Statement stmt = con.createStatement();
            // 批处理：可以同时执行多条sql
            stmt.addBatch(sql1);
            stmt.addBatch(sql2);
            // 创建部门表和员工表
            int[] row = stmt.executeBatch();
            JdbcUtil.close(con, stmt);
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }
}
