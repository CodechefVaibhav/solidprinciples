package com.solid.principles.exercises.lsp;

/**
 * @author vaibhav.kashyap
 */

public class BankAccount {
	protected double balance;

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
}