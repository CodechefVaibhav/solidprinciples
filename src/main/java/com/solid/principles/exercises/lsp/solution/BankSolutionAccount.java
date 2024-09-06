package com.solid.principles.exercises.lsp.solution;

/**
 * @author vaibhav.kashyap
 */

// Base class for all accounts
public abstract class BankAccountSolution {
    protected double balance;

    public BankAccountSolution(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
}
