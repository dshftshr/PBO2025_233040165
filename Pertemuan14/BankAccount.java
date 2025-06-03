package Pertemuan14;

public class BankAccount {
    private final String accountNumber;  // final variable
    private double balance;

    // Constructor untuk inisialisasi accountNumber
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Final method yang tidak bisa di-override
    public final void displayAccountInfo() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: $" + this.balance);
    }

    public double getBalance() {
        return balance;
    }
}
