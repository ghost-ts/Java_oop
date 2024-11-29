package companypackage;

public class DriverClass {
    public static void main(String[] args) {
        LoyaltyCustomer obj = new LoyaltyCustomer();
        obj.setCustomerData(2, 1099);
        obj.setLoyaltyData(20);
        obj.findDiscount();
    }
}
