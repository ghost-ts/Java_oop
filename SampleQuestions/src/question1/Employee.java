package question1;

public class Employee {
    
    protected int employeeId;
    protected String employeeName;
    protected double basicSalary;

    public void setDetails(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

}
