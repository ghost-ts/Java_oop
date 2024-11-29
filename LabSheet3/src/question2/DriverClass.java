package question2;

public class DriverClass {
    public static void main(String[] args) {
        Manager emp1 = new Manager();
        emp1.setEmployeeData(7, "Nico Robin", 100000);
        emp1.setManagerData(1000, 10000);
        emp1.calculateAndDisplayMonthlyIncome();
    }
}
