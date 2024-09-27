package homework.t2;

import homework.JdbcUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*编写方法，通过ID查询指定学号的学生信息，并封装成Student对象返回。*/
public class Test01 {
    @Test
    public void show(){
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            con = JdbcUtil.getConnection();
            String sql="select name,city,age from student where id=?;";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,4);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString("name") + "\t");
                System.out.print(rs.getString("city") + "\t");
                System.out.println(rs.getInt("age"));
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                JdbcUtil.close(con,pstmt,rs);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
