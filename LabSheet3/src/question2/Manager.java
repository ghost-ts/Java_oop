package question2;

public class Manager extends Employee{
    private double fuelAllowance, incentive;
    
    public void setManagerData(double fuelAllowance, double incentive) {
        this.fuelAllowance = fuelAllowance;
        this.incentive = incentive;
    }
    
    public void calculateAndDisplayMonthlyIncome() {
        System.out.println("Total monthly income = "+(employeeBasicSalary+fuelAllowance+incentive));
    }
}
