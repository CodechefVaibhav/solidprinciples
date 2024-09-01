# Exercise 2: Open/Closed Principle (OCP)

## Scenario

You manage a logistics system where various shipping methods (e.g., Standard, Express) are used. As new shipping methods
are introduced, the shipping cost calculation logic is updated directly in the service class.

## Defective Code

The `ShippingService` violates the OCP because every time a new shipping method is introduced, the class needs to be
modified. This makes the system rigid and prone to errors when adding new functionality.

## Issues

- **Closed for Extension**: The `ShippingService` must be modified every time a new shipping method is added.
- **High Risk**: Modifying existing logic increases the chance of introducing bugs.
- **Violation of OCP**: The service is not open for extension, meaning new behaviors cannot be added without altering
  existing code.

## Solution

- Open for Extension: New shipping methods can be added by creating new classes that implement the ShippingStrategy
  interface and adding them to the strategies map.
- Closed for Modification: The ShippingService class does not need to be modified when new shipping methods are
  introduced, reducing the risk of bugs.
- Flexibility: The strategy pattern allows for dynamic selection of shipping methods at runtime, enhancing the
  flexibility of the system.
