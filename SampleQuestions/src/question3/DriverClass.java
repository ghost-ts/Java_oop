package question3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfTolls = 0, vehicleType = 0;
        boolean validInput = false;

        System.out.println("1 | Car\n2 | Truck\n3 | Motorcycle");

        while(!validInput) {
            try {
                System.out.print("Enter vehicle type: ");
                vehicleType = scan.nextInt();

                if(vehicleType<1 || vehicleType>3) {
                    System.err.println("Vehicle type must be 1, 2, or 3.");
                }
                else {
                    validInput=true;
                }
            } catch (InputMismatchException e) {
                System.err.println(e.toString());
                scan.next();
            }
        }

        validInput = false;

        while(!validInput) {
            try {
                System.out.print("Enter number of tolls: ");
                numberOfTolls = scan.nextInt();
                
                if(numberOfTolls<0) {
                    System.err.println("Number of tolls cannot be negative.");
                }
                else {
                    validInput=true;
                }
            } catch (InputMismatchException e) {
                System.err.println(e.toString());
                scan.next();
            }
        }

        scan.close();

        Vehicle obj1;

        switch (vehicleType) {
            case 1:
                obj1 = new Car();
                break;
            
            case 2:
                obj1 = new Truck();
                break;

            case 3:
                obj1 = new Motorcycle();
                break;
            
            default:
                return;
        }

        double totalTollCharge = obj1.calculateTollCharge(numberOfTolls);

        System.out.println("Total Toll Charge = "+totalTollCharge);

    }

}