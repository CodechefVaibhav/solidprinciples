package com.solid.principles.exercises.lsp;

public class BankAccountClient {

    public static void main(String[] args) {

        //input - Account type and balance stored in DB
        int balance = 5000;

        // Fixed deposit account
        BankAccountService fixedBankAccount = new FixedAccountServiceImpl(balance);
        fixedBankAccount.deposit(500);
        System.out.println("Fixed deposit balance: " + fixedBankAccount.getBalance());

        // Regular account
        RegularAccountService regularBankAccount = new RegularAccountServiceImpl(balance);
        regularBankAccount.deposit(300);
        regularBankAccount.withdraw(100);
        System.out.println("Regular account balance: " + regularBankAccount.getBalance());
    }

}
