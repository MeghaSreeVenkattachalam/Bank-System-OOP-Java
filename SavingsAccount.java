// SavingsAccount.java

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("💹 Interest of ₹" + interest + " applied.");
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("🏦 [Savings Account]");
        super.displayAccountInfo();
        System.out.println("📈 Interest Rate: " + interestRate + "%");
    }
}
