# Exercise 1: Single Responsibility Principle (SRP)

## Scenario

You are building an e-commerce platform where users can place orders. Part of the order process involves generating an invoice and processing the payment. Initially, you decide to handle both tasks within a single service class.

## Defective Code

The `InvoiceService` is responsible for both invoice generation and payment processing. This violates the SRP because the class has more than one reason to change—either due to changes in invoice generation logic or payment processing logic.

## Issues

- **Coupling**: The invoice generation and payment processing logic are tightly coupled.
- **Maintainability**: Any change in the payment process might require changes to the `InvoiceService`, making the class harder to maintain.
- **Reusability**: If you need to reuse the payment logic in another context, it’s locked inside the `InvoiceService`.
