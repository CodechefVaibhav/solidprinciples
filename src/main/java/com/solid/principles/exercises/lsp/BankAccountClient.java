package com.solid.principles.exercises.lsp;

public class BankAccountClient {

    public static void main(String[] args) {

        // Fixed deposit account
        BankAccountService fixedBankAccount = new FixedAccountServiceImpl(5000);
        fixedBankAccount.deposit(500);
        System.out.println("Fixed deposit balance: " + fixedBankAccount.getBalance());

        // Regular account
        RegularAccountService regularBankAccount = new RegularAccountServiceImpl(2000);
        regularBankAccount.deposit(300);
        regularBankAccount.withdraw(100);
        System.out.println("Regular account balance: " + regularBankAccount.getBalance());
    }

}
