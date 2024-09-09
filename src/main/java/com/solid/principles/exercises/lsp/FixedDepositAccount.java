package com.solid.principles.exercises.lsp;

/**
 * @author yash.agarwal
 */

public class FixedDepositAccount extends BankAccount implements DepositAccount {

	@Override
	public boolean deposit(double amount) {
		balance += amount;
		System.out.println("Deposited amount: " + amount);
		return true;
	}

}