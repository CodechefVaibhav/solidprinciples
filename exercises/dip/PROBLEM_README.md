# Exercise 5: Dependency Inversion Principle (DIP)

## Scenario

You are building a reporting system that generates various reports, such as PDF, Excel, and HTML reports. Initially, the
system directly depends on a specific report exporting class, such as `PDFExporter`, which creates a tight coupling
between the report generation logic and the export format.

## Defective Code

The `ReportGenerator` class directly instantiates and depends on the `PDFExporter` class. This tight coupling violates
the DIP, as higher-level modules (like `ReportGenerator`) should not depend on low-level modules (like `PDFExporter`);
instead, both should depend on abstractions.

## Issues

- **Tight Coupling**: The `ReportGenerator` is tightly coupled to `PDFExporter`, making it difficult to extend the
  system to support other formats like Excel or HTML.
- **Difficult to Extend**: To add a new export format, you would have to modify the `ReportGenerator`, violating the
  Open/Closed Principle as well.
- **Hard to Test**: Unit testing the `ReportGenerator` in isolation is difficult because it directly depends on the
  concrete `PDFExporter` class.


## Solution

- Reduced Coupling: ReportGenerator is no longer tightly coupled to a specific exporter, adhering to the Dependency Inversion Principle.
- Open/Closed Principle: The system can be extended to support new formats without modifying existing code, satisfying the Open/Closed Principle.
- Improved Testability: The ReportGenerator can be easily tested in isolation by mocking the ReportExporter interface.

