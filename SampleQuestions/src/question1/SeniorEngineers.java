package question1;

public class SeniorEngineers extends Employee {
    private double finalSalary, projectBonus, performanceBonus;
    
    public void setBonus(double projectBonus, double performanceBonus) {
        this.projectBonus = projectBonus;
        this.performanceBonus = performanceBonus;
    }
    
    public void calculateIncome() {
        finalSalary = this.projectBonus + this.performanceBonus + this.basicSalary;
        System.out.println("Total monthly Salary = "+finalSalary);
    }
}
