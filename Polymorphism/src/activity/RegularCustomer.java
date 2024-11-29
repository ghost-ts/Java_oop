package activity;

public class RegularCustomer extends Customer {

    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount;
    }
    
}
