package com.solid.principles.exercises.lsp;

public interface RegularAccountService extends BankAccountService {

    public void withdraw(double amount);

}
