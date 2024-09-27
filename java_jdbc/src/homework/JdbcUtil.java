package homework;

import java.sql.*;

public class JdbcUtil {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/homework";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "020903";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static void close(Connection con, Statement stmt) throws SQLException {
        close(con,stmt,null);
    }

    public static void close(Connection con, Statement stmt, ResultSet rs) throws SQLException {
        if (con != null) {
            con.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        if (rs != null) {
            rs.close();
        }
    }
}
