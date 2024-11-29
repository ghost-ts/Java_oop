package activity;

public class PremiumCustomer extends Customer {
    @Override
    public double calculateDiscount(double purchaseAmount) {
        purchaseAmount = purchaseAmount*80/100;
        return purchaseAmount;
    }
}
