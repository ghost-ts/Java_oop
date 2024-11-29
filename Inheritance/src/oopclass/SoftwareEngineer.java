package oopclass;

public class SoftwareEngineer extends Employee {
    public double bonusAmount;
    
    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }
    
    public void calculateAndDisplaySalary() {
        System.out.println("Net Salary = "+(empSalary+bonusAmount));
    }
}
