/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek SavingAccount
        SavingAccount savingAccount = new SavingAccount(1000.0, 0.05);

        // Membuat objek CheckingAccount dengan overdraftProtection
        CheckingAccount checkingAccount1 = new CheckingAccount(500.0, 200.0);

        // Membuat objek CheckingAccount tanpa overdraftProtection (default)
        CheckingAccount checkingAccount2 = new CheckingAccount(300.0);

        // Melakukan deposit dan withdraw
        savingAccount.deposit(200.0);
        savingAccount.withdraw(50.0);

        checkingAccount1.deposit(100.0);
        checkingAccount1.withdraw(700.0); // Withdrawal failed: Insufficient funds

        checkingAccount2.withdraw(400.0);

        // Menampilkan saldo akhir
        System.out.println("Saving Account Balance: " + savingAccount.getBalance());
        System.out.println("Checking Account 1 Balance: " + checkingAccount1.getBalance());
        System.out.println("Checking Account 2 Balance: " + checkingAccount2.getBalance());
    }
}
