package homework.t4;

import com.itheima.jdbc.util.JdbcUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*.编写方法，查询学生表所有的学生，封装成List<Student>返回*/
public class Test1 {
    @Test
    public void select(){
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            con = JdbcUtil.getConnection();
            String sql="select id,name,city,age from student;";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            List<Student> list=new ArrayList<>();
            while(rs.next()){
                list.add(new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("city"),
                        rs.getInt("age")));
            }
            for (Student student : list) {
                System.out.println(student);
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.close(con,pstmt,rs);
        }
    }
}
