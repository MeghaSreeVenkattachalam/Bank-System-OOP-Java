// Account.java

public class Account extends BankService {
    private String accountHolderName;
    private int accountNumber;
    protected double balance;
    private static int counter = 1001;

    public Account(String name, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = counter++;
        this.balance = initialBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ ₹" + amount + " deposited successfully.");
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ ₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("👤 Name: " + accountHolderName);
        System.out.println("🔢 Account Number: " + accountNumber);
        System.out.println("💰 Balance: ₹" + balance);
    }

    @Override
    public void openAccount() {
        System.out.println("✅ Account opened for " + accountHolderName);
    }

    @Override
    public void closeAccount() {
        System.out.println("🚫 Account closed for " + accountHolderName);
    }
}
