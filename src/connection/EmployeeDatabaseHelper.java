package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDatabaseHelper {
    public ResultSet getAllEmployeeDetails(Connection connection) {
        ResultSet resultSet = null;
        String selectAllEmployees = "SELECT * FROM Employee;";
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectAllEmployees);
        } catch (SQLException e) {
            System.out.println("Could Not Create Statement!");
        }
        return resultSet;
    }
}
