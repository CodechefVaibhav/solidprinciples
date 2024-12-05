package com.solid.principles.exercises.lsp;

/**
 * @author shubhang21
 */

public class BankAccount extends Account implements WithdrawableAccount, DepositableAccount  {

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}
	
	
	
}