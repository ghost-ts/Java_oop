package oopclass;

import java.util.Scanner;

class Magazine {
    private int magCode;
    private double noPages, costPerPage, totalCost;
    
    public void inputData(int code, double pages, double cost) {
        magCode = code;
        noPages = pages;
        costPerPage = cost;
    }
    
    public void calculateTotalCost() {
        totalCost = noPages * costPerPage;
    }
    
    public void diplayCost() {
        System.out.println("Total Cost = "+totalCost);
    }
    
}

public class LabSheet1 {
    public static void main(String[] args) {
        int magCode;
        double noPages, costPerPage, totalCost;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter magazine code: ");
        magCode = scanner.nextInt();
        System.out.print("Enter number of pages: ");
        noPages = scanner.nextDouble();
        System.out.print("Enter cost per page: ");
        costPerPage = scanner.nextDouble();
        
        Magazine mag1 = new Magazine();
        mag1.inputData(magCode, noPages, costPerPage);
        mag1.calculateTotalCost();
        mag1.diplayCost();
        
    }
}
