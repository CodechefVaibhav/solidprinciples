package com.solid.principles.exercises.lsp.solution;

/**
 * @author vaibhav.kashyap
 */

public class FixedDepositSolutionAccount extends BankSolutionAccount {

	@Override
	public void withdraw(double amount) {
		throw new UnsupportedOperationException("Withdrawals are not allowed on fixed deposit accounts.");
	}
}