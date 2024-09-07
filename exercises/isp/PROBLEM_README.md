# Exercise 4: Interface Segregation Principle (ISP)

## Scenario

You are developing an office management system that handles different devices, such as printers and scanners. Initially,
a single `Device` interface is created to represent all devices.

## Defective Code

The `Device` interface forces all implementing classes to provide methods for both printing and scanning. However, not
all devices support both functions (e.g., a printer doesn’t scan).

## Issues

- **Interface Pollution**: The `PrinterPrblm` class is forced to implement the `scan` method, which it doesn’t need.
- **Violation of ISP**: Clients are forced to depend on methods they don’t use.
- **Poor Design**: The design violates ISP by combining unrelated functionalities in a single interface.


## Solution

- Adherence to ISP: Clients now depend only on the interfaces that are relevant to them.
- Improved Design: The design is cleaner and more modular, with each device implementing only the functionality it supports.
- Flexibility: It becomes easier to add new functionalities or devices without affecting existing code.