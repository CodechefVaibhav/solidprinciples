package com.solid.principles.exercises.lsp;

import io.micrometer.observation.annotation.Observed;

/**
 * @author praveen.krishna
 */

public class FixedAccountImpl implements FixedAccountInterface {
	protected double balance;

	public FixedAccountImpl(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Observed
	public double getBalance() {
		return balance;
	}

}