package com.solid.principles.exercises.lsp;

import org.springframework.stereotype.Service;

/**
 * @author praveen.krishna
 */

@Service
public class FixedAccountServiceImpl implements BankAccountService {
	protected double balance;

	public FixedAccountServiceImpl(double initialBalance) {
		this.balance = initialBalance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}

}