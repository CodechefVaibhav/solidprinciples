package com.solid.principles.exercises.lsp.solution;

/**
 * @author vaibhav.kashyap
 */

public abstract class BankSolutionAccount {
	protected double balance;

	public void deposit(double amount) {
		balance += amount;
	}

	public abstract void withdraw(double amount);

	public double getBalance() {
		return balance;
	}
}