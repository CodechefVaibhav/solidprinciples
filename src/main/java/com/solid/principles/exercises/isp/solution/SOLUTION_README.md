# Solution

Split the `Device` interface into smaller, more specific interfaces. Now, each device only implements the interfaces relevant to its functionality, adhering to the ISP.

# Improvements

- **Interface Segregation**: Devices only implement the methods they need, reducing unnecessary code.
- **Flexibility**: New devices can be added without implementing irrelevant methods.
- **Better Design**: The system is now more modular, with clear separation of concerns.
