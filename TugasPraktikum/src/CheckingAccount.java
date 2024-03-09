/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class CheckingAccount extends Account {
    private double overdraftProtection;

    // Constructor dengan dua parameter
    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance + overdraftProtection);
        this.overdraftProtection = overdraftProtection;
    }

    // Constructor dengan satu parameter (default overdraftProtection = -1.0)
    public CheckingAccount(double balance) {
        this(balance, -1.0);
    }

    // Override method withdraw
    @Override
    public boolean withdraw(double amount) {
        double overdraftNeeded = amount - balance;

        if (balance - amount >= 0.0) {
            balance -= amount;
            return true;
        } else {
            if (overdraftProtection == -1.0 || overdraftProtection < overdraftNeeded) {
                System.out.println("Withdrawal failed: Insufficient funds");
                return false;
            } else {
                balance = 0.0;
                overdraftProtection -= overdraftNeeded;
                return true;
            }
        }
    }
}