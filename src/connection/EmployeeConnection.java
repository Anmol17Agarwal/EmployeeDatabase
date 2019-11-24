package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConnection {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }

    public static boolean closeConnection() {
        boolean isConnectionClosed = false;
        // check if there is a connection present already
        if (getConnection() != null) {
            try {
                getConnection().close();
                isConnectionClosed = true;
            } catch (SQLException e) {
                System.out.println("Could not close connection");
            }
        }
        return isConnectionClosed;
    }

    /**
     * This method will attempt to connect to the database via a URL path, username and password
     * and return whether the connection was successful or not.
     */
    public boolean attemptConnection() {
        boolean isConnected = false;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            if (connection != null) {
                isConnected = true;
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception Occurred!");
        }
        return isConnected;
    }
}
