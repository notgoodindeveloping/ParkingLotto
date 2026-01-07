package proyekbesar.backend;

import java.sql.*;

public class DBConnection {
   private static final String DB_URL = "jdbc:mysql://localhost/sistem_parkir";
   private static final String USER = "root";
   private static final String PASS = "zaki1234";
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
