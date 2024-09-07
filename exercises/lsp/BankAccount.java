package com.solid.principles.exercises.lsp;

/**
 * @author Khalid.najam
 */

public class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}