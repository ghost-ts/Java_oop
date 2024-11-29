package oopclass;

import java.util.Scanner;

public class Employee {
    public int empId;
    public String empName;
    public double empSalary;
    
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        empId = scanner.nextInt();
        
        System.out.print("Enter Employee Name: ");
        scanner.next();
        empName = scanner.nextLine();
        
        System.out.print("Enter Employee Salary: ");
        empSalary = scanner.nextDouble();
    }
    
    public void displayData() {
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+empSalary);
    }
}
