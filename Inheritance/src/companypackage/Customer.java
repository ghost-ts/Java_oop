package companypackage;

public class Customer {
    protected int customerCode;
    protected double customerBillAmount;
    
    public void setCustomerData(int customerCode, double customerBill) {
        this.customerCode = customerCode;
        this.customerBillAmount = customerBill;
    }
}
