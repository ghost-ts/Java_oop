package oopclass;

import java.util.Scanner;

class LoanAccount {
    private String accountNumber, accountHolderName;
    private double loanAmount, interestRate, balance;
    private int loanTerm;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if(accountNumber!=null) {
            this.accountNumber = accountNumber;
        }
        else {
            System.err.println("Account number cannot be null.");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if(!accountHolderName.trim().isEmpty()) {
            this.accountHolderName = accountHolderName;
        }
        else {
            System.err.println("Account holder name should not be empty.");
        }
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if(loanAmount>0) {
            this.loanAmount = loanAmount;
        }
        else {
            System.err.println("Invalid loan amount.");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if(interestRate>=0 && interestRate<=100) {
            this.interestRate = interestRate;
        }
        else {
            System.err.println("Invalid interest rate.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getLoadTerm() {
        return loanTerm;
    }

    public void setLoadTerm(int loanTerm) {
        if(loanTerm>=1 && loanTerm<=30) {
            this.loanTerm = loanTerm;
        }
        else {
            System.err.println("Loan term must be at least 1 year and no more than 30 years.");
        }
    }
}

public class LabSheet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String accountNumber, accountHolderName;
        double loanAmount, interestRate;
        int loanTerm;
        
        LoanAccount account1 = new LoanAccount();
        
        System.out.print("Enter account number: ");
        accountNumber = scanner.nextLine();
        account1.setAccountNumber(accountNumber);
        
        System.out.print("Enter account holder name: ");
        accountHolderName = scanner.nextLine();
        account1.setAccountHolderName(accountHolderName);
        
        System.out.print("Enter loan amount: ");
        loanAmount = scanner.nextDouble();
        account1.setLoanAmount(loanAmount);
        
        System.out.print("Enter interest rate: ");
        interestRate = scanner.nextDouble();
        account1.setInterestRate(interestRate);
        
        System.out.print("Enter loan term: ");
        loanTerm = scanner.nextInt();
        account1.setLoadTerm(loanTerm);
        
        account1.setBalance(100000);
    }
}
