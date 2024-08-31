package com.solid.principles.exercises.isp;

public class PrinterClient {

    PrinterService printerService;

    PrinterClient(PrinterService printer) {
        this.printerService = printer;
    };

    public void printerOperation(String document) {
        System.out.println("Starting print operation...");
        printerService.print(document);
        System.out.println("Print operation completed.");
    }

}
