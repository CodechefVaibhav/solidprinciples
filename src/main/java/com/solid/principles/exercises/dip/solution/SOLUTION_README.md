# Solution

Introduce an abstraction (`ReportExporterSolution` interface) that both `ReportGeneratorSolution` and `PDFExporterSolution` depend on. This decouples `ReportGeneratorSolution` from any specific report export format and makes the system more flexible and easier to extend.

# Improvements

- **Adherence to DIP**: Both `ReportGeneratorSolution` and `PDFExporterSolution` depend on the `ReportExporterSolution` abstraction, promoting loose coupling.
- **Flexibility**: New export formats (e.g., Excel, HTML) can be added without modifying `ReportGeneratorSolution`.
- **Ease of Testing**: Testing `ReportGeneratorSolution` is simplified by mocking the `ReportExporterSolution` interface.
