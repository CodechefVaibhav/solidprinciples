package com.solid.principles.exercises.lsp.solution;

/**
 * @author vaibhav.kashyap
 */

// A fixed deposit account does not support withdrawals
public class FixedDepositSolutionAccount extends BankSolutionAccount {
    
    public FixedDepositSolutionAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        throw new UnsupportedOperationException("Fixed deposit accounts cannot accept additional deposits.");
    }

    // No withdraw method here, as this account type doesn't support withdrawals
}
