package connection;

import java.sql.Connection;

public class EmployeeConnection {
    public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/test";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    private static Connection connection = null;

    /**
     * This method will attempt to connect to the database via a URL path, username and password
     * and return whether the connection was successful or not.
     */
    public boolean attemptConnection() {
        return false;
    }
}
