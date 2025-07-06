// CurrentAccount.java

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String name, double balance, double overdraftLimit) {
        super(name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            balance -= amount;
            System.out.println("✅ ₹" + amount + " withdrawn (including overdraft).");
        } else {
            System.out.println("❌ Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("🏦 [Current Account]");
        super.displayAccountInfo();
        System.out.println("💳 Overdraft Limit: ₹" + overdraftLimit);
    }
}
