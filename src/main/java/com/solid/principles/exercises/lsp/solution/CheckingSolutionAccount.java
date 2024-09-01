package com.solid.principles.exercises.lsp.solution;

import com.solid.principles.exercises.lsp.BankAccount;

/**
 * @author vaibhav.kashyap
 */

public class CheckingSolutionAccount extends BankAccount {

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}