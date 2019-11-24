package connection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDatabaseMain {
    public static void main(String[] args) {
        EmployeeConnection employeeConnection = new EmployeeConnection();
        if (employeeConnection.attemptConnection()) {
            System.out.println("Connection Created Successfully!");
        } else {
            System.out.println("Connection Failed and I Don't Know Why!");
        }

        EmployeeDatabaseHelper databaseHelper = new EmployeeDatabaseHelper();
        ResultSet allEmployeeSet = databaseHelper.getAllEmployeeDetails(EmployeeConnection.getConnection());
        while (true) {
            try {
                if (!allEmployeeSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                System.out.println("Employee Name: " + allEmployeeSet.getString("empName"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        if (EmployeeConnection.getConnection() != null) {
            System.out.println(EmployeeConnection.closeConnection() ?
                    "Connection Closed Successfully" : "Something happened");
        }
    }
}
