package com.solid.principles.solutions.lsp;

public class BankAccount extends Account implements Depositable, Withdrawable {

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

}