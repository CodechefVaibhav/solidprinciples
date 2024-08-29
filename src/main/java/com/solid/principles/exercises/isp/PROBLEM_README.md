# Exercise 4: Interface Segregation Principle (ISP)

## Scenario

You are developing an office management system that handles different devices, such as printers and scanners. Initially, a single `Device` interface is created to represent all devices.

## Defective Code

The `Device` interface forces all implementing classes to provide methods for both printing and scanning. However, not all devices support both functions (e.g., a printer doesn’t scan).

## Issues

- **Interface Pollution**: The `PrinterPrblm` class is forced to implement the `scan` method, which it doesn’t need.
- **Violation of ISP**: Clients are forced to depend on methods they don’t use.
- **Poor Design**: The design violates ISP by combining unrelated functionalities in a single interface.
