package com.solid.principles.exercises.lsp;

/**
 * @author praveen.krishna
 */

public class BankAccountImpl implements BankAccountInterface {
	protected double balance;

	public BankAccountImpl(double balance) {
		this.balance = balance;
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