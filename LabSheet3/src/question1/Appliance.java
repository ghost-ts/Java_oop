package question1;

public class Appliance {
    private int applianceCode;
    private double appliancePrice;
    private int saleDiscountRate;
    
    public Appliance(int applianceCode, double appliancePrice) {
        this.applianceCode = applianceCode;
        this.appliancePrice = appliancePrice;
    }
    
    public Appliance(int applianceCode, double appliancePrice, int saleDiscountRate) {
        this.applianceCode = applianceCode;
        this.appliancePrice = appliancePrice;
        this.saleDiscountRate = saleDiscountRate;
    }
    
    public void calculateSaleDiscount() {
        System.out.println("Appliance Code: "+applianceCode);
        System.out.println("Discount = "+(appliancePrice*saleDiscountRate/100));
        System.out.println();
    }
}
