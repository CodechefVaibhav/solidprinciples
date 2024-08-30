package com.solid.principles.exercises.lsp;

public class client {

    public static void main(String[] args) {

        // Fixed deposit account
        FixedAccountImpl fixedBankAccount = new FixedAccountImpl(5000);
        fixedBankAccount.deposit(500);

        System.out.println("Fixed deposit balance: " + fixedBankAccount.getBalance());
    }

}
