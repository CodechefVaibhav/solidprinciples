package com.solid.principles.exercises.lsp;

public interface Account {

        void deposit(double amount);
        double getBalance();
        // Withdraw might not be appropriate for all account types
    }

