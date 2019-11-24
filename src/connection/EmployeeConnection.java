package connection;

import java.sql.Connection;

public class EmployeeConnection {
    public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/test";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    private static Connection connection = null;
}
