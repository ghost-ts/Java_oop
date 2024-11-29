package mypackage;

import java.util.Scanner;

public class Activity01 {
    
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        //#01
//        int years=0;
//        System.out.print("Enter employee's years of service: ");
//        years = scanner.nextInt();
//        while(years<0) {
//            System.out.println("Invalid Input!");
//            System.out.print("Enter employee's years of service: ");
//            years = scanner.nextInt();
//        }
//
//        System.out.print("Enter current salary: ");
//        double salary = scanner.nextDouble();
//        
//        if(years>10) {
//            salary = salary*10/100;
//        }
//        else if(years>=5) {
//            salary = salary*5/100;
//        }
//        else if(years>0){
//            salary = salary*2/100;
//        }
//        
//        System.out.println("Bonus Salary = "+salary);

        //#02
        
//        double finalBill = 0;
//        
//        System.out.print("Enter package type: ");
//        int packageType = scanner.nextInt();
//        while(packageType<1 || packageType>3) {
//            System.out.println("Invalid Input!");
//            System.out.print("Enter package type: ");
//            packageType = scanner.nextInt();
//        }
//        
//        System.out.print("Enter number of units: ");
//        double units = scanner.nextDouble();
//        while(units<0) {
//            System.out.println("Invalid Input!");
//            System.out.print("Enter number of units: ");
//            units = scanner.nextDouble();
//        }
//        
//        switch(packageType) {
//            case 1 -> finalBill = 2500+(2*units);
//            case 2 -> finalBill = 1500+(3*units);
//            case 3 -> finalBill = 1000+(3.5*units);
//        }
//        
//        System.out.println("Final Bill = "+finalBill);
        
        //#03
        
//        System.out.print("Enter number of sales per months: ");
//        double salesPerMonth = scanner.nextDouble();
//        while(salesPerMonth<0) {
//            System.out.println("Invalid Input!");
//            System.out.print("Enter number of sales per months: ");
//            salesPerMonth = scanner.nextDouble();
//        }
//        
//        double avarageSales = salesPerMonth/30;
//        
//        if(avarageSales>=15){
//            System.out.println("Excellent");
//        }
//        else if(avarageSales>=10){
//            System.out.println("Good");
//        }
//        else if(avarageSales>=5){
//            System.out.println("Need More Product Advertising");
//        }
        
        //#04
        
//        int rainFall[] = new int[12];
//        String months[] = {"January","February","March","April","May","June","July","August","September" ,"October","November","December"};
//        int index=0;
//        int annualRainFall=0;
//        for(int i=0;i<12;i++) {
//            System.out.print(months[i]+"|\tEnter monthly average rain fall: ");
//            rainFall[i]=scanner.nextInt();
//            annualRainFall=annualRainFall+rainFall[i];
//        }
//        
//        System.out.println("\nAnnual Rain Fall = "+annualRainFall);
//        
//        int max=rainFall[0];
//        int min=max;
//       
//        for(int i=1;i<12;i++) {
//            if(max<rainFall[i]) {
//                max=rainFall[i];
//                index=i;
//            }
//        }
//        
//        System.out.println("\nHeaviest rain fall,\n"+months[index]+" = "+max);
//        
//        for(int j=1;j<12;j++) {
//            if(min>rainFall[j]) {
//                min=rainFall[j];
//                index=j;
//            }
//        }
//        System.out.println("\nMinimum rain fall,\n"+months[index]+" = "+min);
//        
//        System.out.println("\nRain Fall list,");
//        for(int k=11;k>=0;k--) {
//            System.out.println(months[k]+" = "+rainFall[k]);
//        }
        
        //#05
        
        int covidCases[] = new int[12];
        String months[] = {"January","February","March","April","May","June","July","August","September" ,"October","November","December"};
        int index=0;
        double totalCases=0;
        
        for(int i=0;i<12;i++) {
            System.out.print(months[i]+"|\tEnter number of Covid cases: ");
            covidCases[i]=scanner.nextInt();
            totalCases=totalCases+covidCases[i];
        }
        
        int max=covidCases[0];
        int min=max;
        
        for(int i=1;i<12;i++) {
            if(min>covidCases[i]) {
                min=covidCases[i];
                index=i;
            }
        }
        System.out.println("\nMinimum number of Covid cases,\n"+months[index]+" = "+min);
        
        for(int i=1;i<12;i++) {
            if(max<covidCases[i]) {
                max=covidCases[i];
                index=i;
            }
        }
        System.out.println("\nMaximum number of Covid cases,\n"+months[index]+" = "+max);
        
        System.out.println("\nTotal number of Covid Cases in 2021 = "+totalCases);

        System.out.println("\nMonths which are greater than average("+(totalCases/12)+") Covid cases,");
        for(int i=1;i<12;i++) {
            if((totalCases/12)<covidCases[i]) {
                System.out.println(months[i]+" = "+covidCases[i]);
            }
        }

    }
    
}
