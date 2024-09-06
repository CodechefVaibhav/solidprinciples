package com.solid.principles.exercises.lsp.solution;

/**
 * @author vaibhav.kashyap
 */

// Interface for accounts that support withdrawals
public interface WithdrawableAccount {
    void withdraw(double amount);
}
