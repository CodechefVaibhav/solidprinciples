package com.solid.principles.solutions.lsp;

public class FixedDepositAccount extends BankAccount {

	public void withdraw(double amount) {
		throw new UnsupportedOperationException("Withdrawals are not allowed on fixed deposit accounts.");
	}
}