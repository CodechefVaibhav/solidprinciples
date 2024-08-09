Liskov Substitution Principle (LSP)

Principle Explanation
The Liskov Substitution Principle (LSP) is one of the SOLID principles of object-oriented programming. It states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. This means that derived classes must be substitutable for their base classes without altering the desirable properties of the program.

When a subclass violates the LSP, it often leads to unexpected behaviors or requires special handling of subclasses, breaking the polymorphism that object-oriented programming seeks to provide.

Real-World Example: Document Management System
Let's consider a document management system where different types of documents (e.g., TextDocument and ReadOnlyDocument) are managed. We'll illustrate how violating LSP can lead to problems and then refactor the code to adhere to the principle.

Defective Version Explanation
In the defective version, the ReadOnlyDocumentService class extends the TextDocumentService class. However, because ReadOnlyDocumentService represents a document that cannot be modified, it overrides methods to throw exceptions when modifications are attempted. This violates the Liskov Substitution Principle because ReadOnlyDocumentService cannot be substituted in place of TextDocumentService without causing errors.

Problems with the Defective Version
Violation of LSP: The ReadOnlyDocumentService cannot be used in place of TextDocumentService because it throws an exception when attempting to modify its content. This breaks the expected behavior that any subclass of TextDocumentService should support content modification.
Unexpected Exceptions: Code that expects a TextDocumentService and attempts to modify it may encounter UnsupportedOperationException, which leads to runtime errors and requires special handling.
Poor Design: The need to throw exceptions in ReadOnlyDocumentService indicates a poor design where inheritance is used incorrectly.

Expected Output for Defective Version
Successful content addition:

URL: /defective/document/add-content
Output: Content added: Initial content. Additional content.
Failed content addition to read-only document:

URL: /defective/document/add-content-read-only
Output: Failed to add content: Cannot modify a read-only document

Refactored Version Explanation
In the refactored version, we adhere to the Liskov Substitution Principle by separating the concepts of TextDocumentService and ReadOnlyDocumentService. Instead of using inheritance, we use a common interface DocumentService and provide separate implementations for read/write and read-only behaviors. This design ensures that each class adheres to its expected behavior and can be used interchangeably where appropriate.

Benefits of the Refactored Version
Adherence to LSP: The ReadOnlyDocumentService and TextDocumentService both implement the DocumentService interface, and each class behaves according to its contract. The ReadOnlyDocumentService is not expected to support modification, so it does not inherit from TextDocumentService.
Clear Design: The separation of read/write and read-only documents into different classes with a common interface makes the code more understandable and maintainable.
No Unexpected Exceptions: Since ReadOnlyDocumentService does not allow modification by design, there is no need to throw exceptions. This avoids unexpected runtime errors and simplifies the logic in DocumentController.

Expected Output for Refactored Version
Successful content addition:
URL: `/refactored/document