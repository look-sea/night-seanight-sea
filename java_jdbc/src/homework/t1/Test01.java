package homework.t1;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import homework.JdbcUtil;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/*模拟用户登录：需求如下
        1.创建一张用户表(id,name,password)
        2.添加几条用户记录
        3.从键盘上输入用户和密码，拼接SQL语句
        4.使用Statement执行SQL语句。
        以上所有的操作要求使用JDBC相关API完成。
        训练步骤
        注册数据库驱动
        获得数据库连接对象
        执行DDL创表语句
        执行DML插入用户数据语句
        执行DQL查询语句
        关闭相关资源。*/
public class Test01 {
    public static void main(String[] args) throws Exception {
        // 创建用户表
        createUserTable();
        // 插入用户数据
        insertUserData();
        // 用户登录
        login();
    }
    // 创建用户表
    public static void createUserTable() throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/homework";
            String username = "root";
            String password = "020903";
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "create table user " +
                    "(" +
                    "    id int primary key auto_increment," +
                    "    name varchar(20) unique," +
                    "    password varchar(20)" +
                    ");";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
    }
    // 插入用户数据
    public static void insertUserData() throws Exception {

        Connection con=JdbcUtil.getConnection();
        String sql="insert into user(name,password) values('张三','123456'),('李四','123')";
        PreparedStatement pstmt = con.prepareStatement(sql);
        int row = pstmt.executeUpdate();
        System.out.println("修改了"+row+"条记录");
        JdbcUtil.close(con,pstmt);
    }
    // 用户登录
    public static void login() throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String s1 = sc.next();
        System.out.println("请输入密码:");
        String s2 = sc.next();
        Properties prop=new Properties();
        prop.load(new FileInputStream("src//druid.properties"));
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        Connection con = ds.getConnection();
        String sql="select id,name,password from user;";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()){
            if(s1.equals(rs.getString("name"))&&s2.equals(rs.getString("password"))){
                System.out.println("登陆成功");
                return;
            }else{
                System.out.println("登录失败");
                return;
            }
        }
    }
}
