package com.solid.principles.exercises.isp;

public class OfficeManagementSystem {
    public void managePrinter(Printer printer, Document document) {
        printer.print(document);
    }

    public void manageScanner(Scanner scanner, Document document) {
        scanner.scan(document);
    }

    public static void manageMySystem() {
        Printer printer = new OfficePrinter();
        Scanner scanner = new OfficeScanner();
        MultiFunctionDevice multiFunctionDevice = new MultiFunctionDevice();

        Document document = new Document("This is a test document.");

        OfficeManagementSystem system = new OfficeManagementSystem();
        system.managePrinter(printer, document);
        system.manageScanner(scanner, document);

        system.managePrinter(multiFunctionDevice, document);
        system.manageScanner(multiFunctionDevice, document);
    }
}
