package activity;

public class CorporateCustomer extends Customer {
    @Override
    public double calculateDiscount(double purchaseAmount) {
        purchaseAmount = purchaseAmount*90/100;
        return purchaseAmount;
    }
}
