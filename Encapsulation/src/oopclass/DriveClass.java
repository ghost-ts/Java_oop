package oopclass;

//class Item {
//    public int itemId;
//    public String itemName;
//    public double itemPrice, itemQty, totalAmount;
//    
//    public void fnInputData() {
//        
//    }
//    
//    public void fnProcessData() {
//        
//    }
//    
//    public void fnDisplayData() {
//        
//    }
//}

class BankAccount {
    private int accNo;
    private String accName;
    private double accBalance;
    
    public void setData(int no, String name, double balance) {
        accNo = no;
        accName = name;
        accBalance = balance;
    }
    
    public void withdrawAmount(double amount) {
        if(accBalance>=amount) {
            accBalance-=amount;
            System.out.println("Your new balance = "+accBalance);
        }
        else {
            System.out.println("Please check your balance!");
        }
    }
    
    public void depositAmount(double amount) {
        if(amount>0) {
            accBalance+=amount;
            System.out.println("New balance = "+accBalance);
        }
        else {
            System.out.println("Invalid amount!");
        }
    }
}

public class DriveClass {
    
    public static void main(String args[]) {
        BankAccount account1 = new BankAccount();
        
        account1.setData(2662, "Robin", 100000);
        //account1.accBalance = 1000000;
        account1.withdrawAmount(1000);
        
        account1.depositAmount(1000);
    }

}
