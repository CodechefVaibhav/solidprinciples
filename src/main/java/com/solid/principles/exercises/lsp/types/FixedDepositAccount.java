package com.solid.principles.exercises.lsp.types;

/**
 * @author vaibhav.kashyap
 */

public class FixedDepositAccount extends BankAccount {

	@Override
	public void withdraw(double amount) {
		throw new UnsupportedOperationException("Withdrawals are not allowed on fixed deposit accounts.");
	}
}