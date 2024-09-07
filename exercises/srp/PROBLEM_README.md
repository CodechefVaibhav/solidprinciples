# Exercise 1: Single Responsibility Principle (SRP)

## Scenario

You are building an e-commerce platform where users can place orders. Part of the order process involves generating an
invoice and processing the payment. Initially, you decide to handle both tasks within a single service class.

## Defective Code

The `InvoiceService` is responsible for both invoice generation and payment processing. This violates the SRP because
the class has more than one reason to change—either due to changes in invoice generation logic or payment processing
logic.

## Issues

- **Coupling**: The invoice generation and payment processing logic are tightly coupled.
- **Maintainability**: Any change in the payment process might require changes to the `InvoiceService`, making the class
  harder to maintain.
- **Reusability**: If you need to reuse the payment logic in another context, it’s locked inside the `InvoiceService`.

## Solution

- Decoupling: By separating the invoice, payment and ordering processing into different classes, we reduce the coupling between these two functionalities.
- Maintainability: Changes to the payment processing logic will only affect the PaymentService class, making it easier to maintain and update without impacting the invoice generation logic.
- Reusability: The PaymentService can now be reused in other parts of the application or in different contexts without being tied to the InvoiceService.
- Testability: Each service can be tested independently, improving the testability of the code.