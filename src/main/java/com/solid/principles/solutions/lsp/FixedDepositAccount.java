package com.solid.principles.solutions.lsp;

public class FixedDepositAccount extends Account implements Depositable {

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
}