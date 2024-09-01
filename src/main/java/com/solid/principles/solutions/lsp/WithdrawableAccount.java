package com.solid.principles.solutions.lsp;

public class WithdrawableAccount extends BankAccount {

    public void withdraw(double amount) {
        balance -= amount;
    }
}
