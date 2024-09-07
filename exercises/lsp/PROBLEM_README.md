# Exercise 3: Liskov Substitution Principle (LSP)

## Scenario

You are developing a banking application that supports different types of accounts. A `BankAccount` class is created for
common account operations, and a `FixedDepositAccount` subclass is added to handle fixed deposits.

## Defective Code

The `FixedDepositAccount` violates the LSP because it alters the behavior of the `withdraw` method inherited from the
`BankAccount`. This method throws an exception, which is not the expected behavior of a `BankAccount`.

## Issues

- **Unexpected Behavior**: A client using `BankAccount` expects to be able to withdraw funds, but `FixedDepositAccount`
  changes this behavior.
- **Violation of LSP**: The substitution of `BankAccount` with `FixedDepositAccount` breaks the expected functionality.
- **Design Flaw**: The `FixedDepositAccount` should not inherit behavior it cannot adhere to.

## Solution

- Separate Interface for Withdrawal Accounts: Introduce an interface, Withdrawable, that defines the withdrawal
  method. Only classes that support withdrawals should implement this interface.
- Redefine Class Hierarchy: Modify the class hierarchy so that only accounts that support withdrawals implement the
  Withdrawal interface.
