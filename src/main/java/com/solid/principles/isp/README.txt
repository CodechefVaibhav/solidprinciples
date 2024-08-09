Interface Segregation Principle (ISP)

Principle Explanation
The Interface Segregation Principle (ISP) is one of the SOLID principles of object-oriented programming. It states that no client should be forced to depend on methods it does not use. This principle is about splitting large, unwieldy interfaces into smaller, more specific ones so that classes implementing those interfaces only need to be concerned with the methods that are relevant to them.

When a class is forced to implement methods it doesn't need, it can lead to unnecessary complexity, harder maintenance, and violation of the Interface Segregation Principle.

Real-World Example: Printer Management System
Let's consider a printer management system where different types of printers (e.g., InkjetPrinter and Photocopier) are managed. We'll illustrate how violating ISP can lead to problems and then refactor the code to adhere to the principle.

Defective Version Explanation
In the defective version, there is a single PrinterService interface that combines methods for printing, scanning, and faxing. Both InkjetPrinterService and PhotocopierService are forced to implement all these methods, even though not all methods are relevant to each type of printer. This violates the Interface Segregation Principle.

Problems with the Defective Version
Violation of ISP: Both InkjetPrinterService and PhotocopierService are forced to implement methods (scan and fax) that they do not support, leading to the use of UnsupportedOperationException.
Unnecessary Complexity: The services are burdened with methods that they don't need, making the code more complex and harder to maintain.
Poor Design: The design is rigid, making it difficult to extend the functionality without modifying the existing interfaces and implementations.

Refactored Version Explanation
In the refactored version, we adhere to the Interface Segregation Principle by splitting the PrinterService interface into smaller, more specific interfaces: Printable, Scannable, and Faxable. Each service only implements the interfaces that are relevant to its functionality. This design ensures that no service is forced to implement methods it doesn't need.

Benefits of the Refactored Version
Adherence to ISP: Each service class (InkjetPrinterService and PhotocopierService) only implements the methods it needs, avoiding unnecessary implementation of unrelated methods.
Clear Design: The interface segregation makes the design more modular and easier to understand. Each service class only focuses on what it needs to do.
Ease of Maintenance: The code is easier to maintain and extend because adding new features only requires changes to the relevant interfaces and services, without affecting unrelated functionality.

Sample Request for Refactored Version
# Sample request to print a document using Inkjet Printer
curl -X POST "http://localhost:8080/refactored/printer/print" \
     -d "document=My Inkjet Document"

# Sample request to scan a document using Photocopier
curl -X POST "http://localhost:8080/refactored/printer/scan" \
     -d "document=My Photocopier Document"

Expected Output for Refactored Version
Printing a document using Inkjet Printer:

URL: /refactored/printer/print
Output: Document printed: My Inkjet Document
Scanning a document using Photocopier:

URL: /refactored/printer/scan
Output: Document scanned: My Photocopier Document
