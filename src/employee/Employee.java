package employee;

public class Employee {
    private int empID;
    private String empName;
    private double empSalary;

    public Employee(int empID, String empName, double empSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return String.format("%-4d:%-20s:%-10f", this.getEmpID(), this.getEmpName(), this.getEmpSalary());
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}
