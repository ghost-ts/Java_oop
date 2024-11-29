package oopclass;

class Employee {
    
    int empId;
    String empName, salary, designation;
    
    void work() {
        
    }
    
    void manage() {
        
    }
}

class BankAccount {
    
    int accNo;
    String accName;
    double accBalance;
    
    void withdraw() {
        
    }
    
    void deposit() {
        
    }
    
}

public class DriverClass {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        
        BankAccount acc01 = new BankAccount();
        BankAccount acc02 = new BankAccount();
        BankAccount acc03 = new BankAccount();
        BankAccount acc04 = new BankAccount();
    }
}
