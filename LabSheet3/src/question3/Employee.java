package question3;

public class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double employeeBasicSalary;
    
    public void setEmployeeData(int employeeId, String employeeName, double employeeBasicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBasicSalary = employeeBasicSalary;
    }
    
    public void diplayEmployeeData() {
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Salary: "+employeeBasicSalary);
    }
}
