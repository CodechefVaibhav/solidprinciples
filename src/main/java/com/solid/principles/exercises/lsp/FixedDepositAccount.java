package com.solid.principles.exercises.lsp;

/**
 * @author shubhang21
 */

public class FixedDepositAccount extends Account implements DepositableAccount  {

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	
}