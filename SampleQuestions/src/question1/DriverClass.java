package question1;

public class DriverClass {
    public static void main(String[] args) {
        SeniorEngineers obj = new SeniorEngineers();
        obj.setDetails(1, "Nico Robin", 100000);
        obj.setBonus(1000,10000);
        obj.calculateIncome();
    }
}
