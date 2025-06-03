package Pertemuan14;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // Ini akan menyebabkan COMPILE ERROR karena mencoba meng-override final method
    /*
    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Info:");
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + this.interestRate + "%");
    }
    */

    // Solusi: Membuat method baru dengan nama berbeda
    public void displaySavingsAccountInfo() {
        super.displayAccountInfo();  // Memanggil method final dari parent
        System.out.println("Interest Rate: " + this.interestRate + "%");
    }
}
