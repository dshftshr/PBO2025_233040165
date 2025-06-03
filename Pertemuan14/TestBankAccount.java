package Pertemuan14;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000);
        account.deposit(500);
        account.displayAccountInfo();

        SavingsAccount savings = new SavingsAccount("987654321", 2000, 2.5);
        savings.deposit(1000);
        // savings.displayAccountInfo();  // Tetap memanggil versi parent
        savings.displaySavingsAccountInfo();  // Memanggil method baru
    }
}
