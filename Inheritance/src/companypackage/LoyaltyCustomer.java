package companypackage;

public class LoyaltyCustomer extends Customer {
    private int discountRate;
    
    public void setLoyaltyData(int discountRate) {
        this.discountRate = discountRate;
    }
    
    public void findDiscount() {
        System.out.println("Discount Amount = "+(customerBillAmount*discountRate/100));
    }
}
