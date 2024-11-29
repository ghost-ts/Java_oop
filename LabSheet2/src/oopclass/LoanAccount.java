import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LoanAccount {

    private static Set<String> accountNumbers = new HashSet<>();
    private String accountNumber;
    private String accountHolderName;
    private double loanAmount;
    private double interestRate;
    private int loanTerm; // in years
    private double balance;

    public LoanAccount(String accountNumber, String accountHolderName, double loanAmount, double interestRate, int loanTerm) {
        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        setLoanAmount(loanAmount);
        setInterestRate(interestRate);
        setLoanTerm(loanTerm);
        this.balance = loanAmount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number must be unique and cannot be null.");
        }
        if (accountNumbers.contains(accountNumber)) {
            throw new IllegalArgumentException("Account number is already in use. Please choose a different number.");
        }
        this.accountNumber = accountNumber;
        accountNumbers.add(accountNumber);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName == null || accountHolderName.isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty.");
        }
        this.accountHolderName = accountHolderName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Loan amount must be greater than zero.");
        }
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate < 0 || interestRate > 100) {
            throw new IllegalArgumentException("Interest rate must be between 0 and 100.");
        }
        this.interestRate = interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        if (loanTerm < 1 || loanTerm > 30) {
            throw new IllegalArgumentException("Loan term must be between 1 and 30 years.");
        }
        this.loanTerm = loanTerm;
    }

    public double getBalance() {
        return balance;
    }

    public double calculateMonthlyPayment() {
        return loanAmount / (loanTerm * 12);
    }

    public void makePayment(double payment) {
        if (payment > balance) {
            System.out.println("Payment exceeds the remaining balance. Payment not applied.");
        } else {
            balance -= payment;
            System.out.println("Payment successful. New balance: " + balance);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Loan Term (years): " + loanTerm);
        System.out.println("Current Balance: " + balance);
    }

    // Main method to get user input and validate with loops
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String accountNumber = "";
        String accountHolderName = "";
        double loanAmount = 0;
        double interestRate = 0;
        int loanTerm = 0;

        // Validate account number
        while (true) {
            System.out.println("Enter account number:");
            accountNumber = scanner.nextLine();
            try {
                if (accountNumber == null || accountNumber.isEmpty()) {
                    throw new IllegalArgumentException("Account number cannot be empty.");
                }
                if (accountNumbers.contains(accountNumber)) {
                    throw new IllegalArgumentException("Account number is already in use. Please choose a different number.");
                }
                break; // Exit loop if input is valid
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Validate account holder name
        while (true) {
            System.out.println("Enter account holder name:");
            accountHolderName = scanner.nextLine();
            try {
                if (accountHolderName == null || accountHolderName.isEmpty()) {
                    throw new IllegalArgumentException("Account holder name cannot be empty.");
                }
                break; // Exit loop if input is valid
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Validate loan amount
        while (true) {
            System.out.println("Enter loan amount:");
            try {
                loanAmount = scanner.nextDouble();
                if (loanAmount <= 0) {
                    throw new IllegalArgumentException("Loan amount must be greater than zero.");
                }
                break; // Exit loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Loan amount must be a positive number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Validate interest rate
        while (true) {
            System.out.println("Enter interest rate:");
            try {
                interestRate = scanner.nextDouble();
                if (interestRate < 0 || interestRate > 100) {
                    throw new IllegalArgumentException("Interest rate must be between 0 and 100.");
                }
                break; // Exit loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Interest rate must be between 0 and 100.");
                scanner.next(); // Clear invalid input
            }
        }

        // Validate loan term
        while (true) {
            System.out.println("Enter loan term (in years):");
            try {
                loanTerm = scanner.nextInt();
                if (loanTerm < 1 || loanTerm > 30) {
                    throw new IllegalArgumentException("Loan term must be between 1 and 30 years.");
                }
                break; // Exit loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Loan term must be a number between 1 and 30.");
                scanner.next(); // Clear invalid input
            }
        }

        // Create LoanAccount object
        LoanAccount loan = new LoanAccount(accountNumber, accountHolderName, loanAmount, interestRate, loanTerm);
        loan.displayAccountDetails();
        
        // Close scanner
        scanner.close();
    }
}
