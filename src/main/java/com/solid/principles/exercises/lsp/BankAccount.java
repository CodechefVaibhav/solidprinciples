package com.solid.principles.exercises.lsp;

/**
 * @author vaibhav.kashyap
 */

class BankAccount implements Account {
	private double balance;

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			throw new IllegalArgumentException("Insufficient funds");
		}
	}

	@Override
	public double getBalance() {
		return balance;
	}
}