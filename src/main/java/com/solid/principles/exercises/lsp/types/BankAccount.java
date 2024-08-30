package com.solid.principles.exercises.lsp.types;

import com.solid.principles.exercises.lsp.types.interfaces.Depositable;
import com.solid.principles.exercises.lsp.types.interfaces.Withdrawable;

/**
 * @author vaibhav.kashyap
 */

public class BankAccount extends Account implements Depositable, Withdrawable {
	protected double balance;

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

}