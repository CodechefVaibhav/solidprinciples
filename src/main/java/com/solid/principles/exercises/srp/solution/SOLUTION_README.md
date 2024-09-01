# Solution

Separate the concerns by creating a dedicated `PaymentSolutionService`. The `InvoiceSolutionService` now only focuses on invoice generation, and the `PaymentSolutionService` handles payment processing. This makes each service more cohesive and focused on a single responsibility.

# Improvements

- **Single Responsibility**: The `InvoiceSolutionService` is now responsible only for invoice generation.
- **Loose Coupling**: The `PaymentSolutionService` can be reused independently in other contexts.
- **Ease of Testing**: Each service can be tested in isolation.
