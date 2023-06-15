// Name: Viraj R. Patel
// Student ID: 991682709

import java.util.Date;

// The Account class represents a bank account and stores its ID, balance, annual interest rate, and creation date.
class Account {
    private int id;
    private double annualInterestRate;
    private double balance;
    private Date dateCreated;

    // The default constructor initializes the account with ID and balance set to 0, annualInterestRate to 0.0,
    // and sets the dateCreated to the current date.
    public Account() {
        this(0, 0.0);
    }

    // The parameterized constructor initializes the account with the provided ID, balance, and sets annualInterestRate to 0.0,
    // and the dateCreated to the current date.
    public Account(int id, double balance) {
        this.id = id;
        this.annualInterestRate = 0.0;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    // Retrieves the account ID.
    public int getId() {
        return id;
    }

    // Sets the account ID.
    public void setId(int id) {
        this.id = id;
    }

    // Retrieves the annual interest rate.
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Sets the annual interest rate.
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Retrieves the account balance.
    public double getBalance() {
        return balance;
    }

    // Sets the account balance.
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Retrieves the date the account was created.
    public Date getDateCreated() {
        return dateCreated;
    }

    // Calculates and returns the monthly interest rate.
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12.0;
    }

    // Calculates and returns the monthly interest.
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Deposits the specified amount into the account if the amount is positive.
    // Otherwise, displays an "Invalid amount" message.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }
    
    // Withdraws the specified amount from the account if sufficient funds are available.
    // Otherwise, displays an "Insufficient funds" message.
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

// The Test class demonstrates the usage of the Account class.
public class Test {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000.0);
        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
