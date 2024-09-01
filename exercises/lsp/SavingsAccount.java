package com.solid.principles.exercises.lsp;

public class SavingsAccount extends BankAccount implements Withdrawable {
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
