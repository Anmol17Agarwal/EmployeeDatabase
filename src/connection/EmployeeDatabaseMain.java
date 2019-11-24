package connection;

public class EmployeeDatabaseMain {
    public static void main(String[] args) {
        EmployeeConnection employeeConnection = new EmployeeConnection();
        if (employeeConnection.attemptConnection()) {
            System.out.println("Connection Created Successfully!");
        } else {
            System.out.println("Connection Failed and I Don't Know Why!");
        }
        if (EmployeeConnection.getConnection() != null) {
            System.out.println(EmployeeConnection.closeConnection() ?
                    "Connection Closed Successfully" : "Something happened");
        }
    }
}
