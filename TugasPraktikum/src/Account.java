/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Account {
    protected double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Method getBalance
    public double getBalance() {
        return balance;
    }

    // Method deposit
    public void deposit(double amount) {
        balance += amount;
    }

    // Method withdraw
    public boolean withdraw(double amount) {
        if (balance - amount >= 0.0) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal failed: Insufficient funds");
            return false;
        }
    }
}
