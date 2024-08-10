Dependency Inversion Principle (DIP)

Principle Explanation
The Dependency Inversion Principle (DIP) is one of the SOLID principles of object-oriented programming. It states that high-level modules should not depend on low-level modules. Both should depend on abstractions. Additionally, abstractions should not depend on details. Details should depend on abstractions. This principle aims to decouple the system by introducing interfaces or abstract classes to reduce the dependency of high-level components on specific implementations of low-level components.

Real-World Example: Notification System
Let's consider a notification system where different types of notifications (e.g., EmailNotification and SMSNotification) are managed. We will illustrate how violating DIP can lead to problems and then refactor the code to adhere to the principle.

Defective Version Explanation
In the defective version, the NotificationService class depends directly on the concrete implementations EmailNotificationService and SMSNotificationService. This tight coupling violates the Dependency Inversion Principle because the high-level NotificationService is directly dependent on low-level details (EmailNotificationService and SMSNotificationService).

Problems with the Defective Version
Violation of DIP: The NotificationService class is tightly coupled with the concrete classes EmailNotificationService and SMSNotificationService. This makes it difficult to extend the system with new notification types or modify existing ones without changing the NotificationService class.
Lack of Flexibility: The system is not easily extendable. For example, adding a new type of notification (e.g., PushNotification) would require modifying the NotificationService class, violating the Open/Closed Principle as well.
Hard to Test: Since NotificationService directly depends on the concrete implementations, mocking or replacing these services in unit tests becomes more challenging.
Refactored Version Explanation
In the refactored version, we adhere to the Dependency Inversion Principle by introducing an abstraction, NotificationSender, which both EmailNotificationService and SMSNotificationService implement. The NotificationService now depends on the NotificationSender interface rather than the concrete implementations, making the system more flexible, maintainable, and testable.

Benefits of the Refactored Version
Adherence to DIP: The NotificationService class now depends on an abstraction (NotificationSender) rather than concrete implementations. This makes the high-level NotificationService independent of the details of how notifications are sent.
Flexibility: New types of notifications can be added easily by implementing the NotificationSender interface and registering the new service. No changes are required in the NotificationService class.
Ease of Testing: The system is easier to test because NotificationService depends on an interface that can be easily mocked or stubbed in unit tests.

Sample Request for Refactored Version
# Sample request to send an email notification
curl -X POST "http://localhost:8080/refactored/notification/send" \
     -d "type=email" \
     -d "message=This is an email notification"

# Sample request to send an SMS notification
curl -X POST "http://localhost:8080/refactored/notification/send" \
     -d "type=sms" \
     -d "message=This is an SMS notification"

Expected Output for Refactored Version
Sending an email notification:

URL: /refactored/notification/send
Output: Notification sent: This is an email notification
Console: Sending email: This is an email notification
Sending an SMS notification:

URL: /refactored/notification/send
Output: Notification sent: This is an SMS notification
Console: Sending SMS: This is an SMS notification
