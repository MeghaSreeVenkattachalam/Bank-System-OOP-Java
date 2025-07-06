// BankService.java

public abstract class BankService {
    public abstract void openAccount();
    public abstract void closeAccount();

    public void printWelcome() {
        System.out.println("🏦 Welcome to ABC Bank!");
    }
}
