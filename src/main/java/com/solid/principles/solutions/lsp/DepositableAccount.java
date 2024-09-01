package com.solid.principles.solutions.lsp;

public class DepositableAccount extends BankAccount {

    public void deposit(double amount) {
        balance += amount;
    };
}
