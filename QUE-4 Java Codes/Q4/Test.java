// Name: Viraj R. Patel
// Student ID: 991682709

import java.util.Date;
import java.util.List;

// The Account class represents a bank account and stores its ID, balance, annual interest rate,
// creation date, account holder's name, and transaction history.
class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private List<Transaction> transactions;

    // The constructor initializes the account with the provided ID, balance, name,
    // and sets the annualInterestRate to 0.0. It also sets the dateCreated to the current date
    // and initializes an empty list for transactions.
    public Account(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
        this.name = name;
        this.transactions = new java.util.ArrayList<>();
    }

    // Retrieves the account ID.
    public int getId() {
        return id;
    }

    // Sets the account ID.
    public void setId(int id) {
        this.id = id;
    }

    // Retrieves the account balance.
    public double getBalance() {
        return balance;
    }

    // Sets the account balance.
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Retrieves the annual interest rate.
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Sets the annual interest rate.
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Retrieves the date the account was created.
    public Date getDateCreated() {
        return dateCreated;
    }

    // Retrieves the account holder's name.
    public String getName() {
        return name;
    }

    // Calculates and returns the monthly interest rate.
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12.0;
    }

    // Calculates and returns the monthly interest.
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Withdraws the specified amount from the account if sufficient funds are available.
    // Otherwise, displays an "Insufficient funds" message and adds a new transaction to the transaction history.
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance, "Withdrawal"));
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Deposits the specified amount into the account if the amount is positive.
    // Otherwise, displays an "Invalid amount" message and adds a new transaction to the transaction history.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction('D', amount, balance, "Deposit"));
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Returns a copy of the transaction history.
    public List<Transaction> getTransactions() {
        return new java.util.ArrayList<>(transactions);
    }
}

// The Transaction class represents a bank transaction and stores its date, type (withdrawal or deposit),
// amount, balance after the transaction, and a description.
class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    // The constructor initializes the transaction with the provided type, amount, balance, and description.
    // It also sets the date to the current date.
    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    // Retrieves the date of the transaction.
    public Date getDate() {
        return date;
    }

    // Retrieves the type of the transaction.
    public char getType() {
        return type;
    }

    // Retrieves the amount of the transaction.
    public double getAmount() {
        return amount;
    }

    // Retrieves the balance after the transaction.
    public double getBalance() {
        return balance;
    }

    // Retrieves the description of the transaction.
    public String getDescription() {
        return description;
    }
}

// The Test class demonstrates the usage of the Account class and Transaction class.
public class Test {
    public static void main(String[] args) {
        Account account = new Account(1122, 1000.0, "George");
        account.setAnnualInterestRate(1.5);

        account.deposit(30.0);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.printf("%s Account #%d%nInterest rate: %.2f%%%n" +
                "Balance: %.2f%n" +
                "Transactions: %n",
                account.getName(),
                account.getId(),
                account.getAnnualInterestRate(),
                account.getBalance());

        List<Transaction> transactions = account.getTransactions();
        for (Transaction transaction : transactions) {
            System.out.printf("%nTransaction date: %s%n" +
                    "Transaction type: %s%n" +
                    "Transaction amount: %.2f%n" +
                    "Transaction description: %s%n" +
                    "Balance after transaction: %.2f%n",
                    transaction.getDate().toString(),
                    transaction.getType(),
                    transaction.getAmount(),
                    transaction.getDescription(),
                    transaction.getBalance());
        }
    }
}
