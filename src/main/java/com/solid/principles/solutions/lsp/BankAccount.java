package com.solid.principles.exercises.lsp;

/**
 * @author vaibhav.kashyap
 */

public class BankAccount implements Account {
	protected double balance;

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}
}