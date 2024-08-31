package com.solid.principles.exercises.lsp;

/**
 * @author praveen.krishna
 */

public class RegularAccountServiceImpl implements RegularAccountService {
	protected double balance;

	public RegularAccountServiceImpl(double initialBalance) {
        this.balance = initialBalance;
    }

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}
}