package com.solid.principles.exercises.lsp;

/**
 * @author yash.agarwal
 */

public class SavingsAccount extends BankAccount implements DepositAccount, WithdrawAccount {

    @Override
    public boolean deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount: " + amount);
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > balance)
            return false;

        balance -= amount;
        System.out.println("Withdrawn amount: " + amount);
        return true;
    }

}