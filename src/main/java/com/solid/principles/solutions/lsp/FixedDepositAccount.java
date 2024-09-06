package com.solid.principles.solutions.lsp;

/**
 * @author vaibhav.kashyap
 */

public class FixedDepositAccount implements Account {

	protected double balance;

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}
}