package com.solid.principles.exercises.lsp.solution;

/**
 * @author vaibhav.kashyap
 */
// A standard savings account that supports withdrawal
public class SavingsAccountSolution extends BankAccountSolution implements WithdrawableAccount {
    
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
