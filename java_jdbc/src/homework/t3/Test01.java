package homework.t3;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import homework.JdbcUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*编写方法，通过ID删除指定学号的学生，并且返回删除的行数。*/
public class Test01 {
    @Test
    public void delete(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/day04","root","020903");
            String sql="delete from student where id=?;";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,2);
            int row = pstmt.executeUpdate();
            System.out.println("删除行数为"+row);
            JdbcUtil.close(con,pstmt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
