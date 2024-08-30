package com.solid.principles.exercises.lsp;

/**
 * @author vaibhav.kashyap
 */

class FixedDepositAccount implements Account {
	private double balance;

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	// No withdraw method as it's not applicable
}