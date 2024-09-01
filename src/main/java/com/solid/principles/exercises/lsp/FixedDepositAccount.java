package com.solid.principles.exercises.lsp;

/**
 * @author vaibhav.kashyap
 */

public class FixedDepositAccount extends Account implements DepositableAccount  {

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	
}