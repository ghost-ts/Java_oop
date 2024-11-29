package activity;

import java.util.Scanner;



public class DriverClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int type;
        double purchaseAmount;
        
        System.out.println("1 - Regular Customer");
        System.out.println("2 - Corporate Customer");
        System.out.println("3 - Premium Customer");
        System.out.println();
        
        System.out.print("Enter customer type: ");
        type = scan.nextInt();
        
        
        System.out.print("Enter purchase amount: ");
        purchaseAmount = scan.nextDouble();
        
        Customer obj;
        
        switch(type) {
            case 1:
                obj = new RegularCustomer();
                break;
            case 2:
                obj = new CorporateCustomer();
                break;
            case 3:
                obj = new PremiumCustomer();
                break;
            default:
                System.out.println("Invalid Type!");
                return;
        }
        double finalAmount = obj.calculateDiscount(purchaseAmount);
        System.out.println("Total Price = "+finalAmount);
    }
}
