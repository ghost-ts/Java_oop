package question1;

public class DriverClass {
    public static void main(String[] args) {
        Appliance appliance1 = new Appliance(1, 1000);
        Appliance appliance2 = new Appliance(2, 1000, 20);
        appliance1.calculateSaleDiscount();
        appliance2.calculateSaleDiscount();
    }
}
