// BankApp.java

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService account;

        System.out.println("🎉 Welcome to ABC Bank System");
        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Deposit: ₹");
        double deposit = sc.nextDouble();

        if (choice == 1) {
            System.out.print("Enter Interest Rate (%): ");
            double rate = sc.nextDouble();
            account = new SavingsAccount(name, deposit, rate);
        } else {
            System.out.print("Enter Overdraft Limit: ₹");
            double limit = sc.nextDouble();
            account = new CurrentAccount(name, deposit, limit);
        }

        account.printWelcome();
        account.openAccount();

        int action;
        do {
            System.out.println("\nChoose Action:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Account Info");
            System.out.println("4. Close Account");
            System.out.println("5. Apply Interest (Savings Only)");
            System.out.println("0. Exit");
            action = sc.nextInt();

            switch (action) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    ((Account) account).deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    ((Account) account).withdraw(sc.nextDouble());
                    break;
                case 3:
                    ((Account) account).displayAccountInfo();
                    break;
                case 4:
                    account.closeAccount();
                    break;
                case 5:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).applyInterest();
                    } else {
                        System.out.println("❌ Interest not applicable for current accounts.");
                    }
                    break;
                case 0:
                    System.out.println("👋 Thank you for using ABC Bank!");
                    break;
                default:
                    System.out.println("❌ Invalid option.");
            }
        } while (action != 0);

        sc.close();
    }
}
