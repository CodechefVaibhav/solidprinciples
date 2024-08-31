package com.solid.principles.exercises.isp;

public class DeviceClient {

    public static void main(String[] args) {
        // Create an instance of DeviceServiceImpl that implements both PrinterService
        // and ScannerService
        DeviceServiceImpl deviceService = new DeviceServiceImpl();

        ScannerClient scannerClient = new ScannerClient(deviceService);
        PrinterClient printerClient = new PrinterClient(deviceService);

        // Perform printing operation
        printerClient.printerOperation("print_doc");

        // Perform scanning operation
        scannerClient.scannerOperation("scan_doc");

    }

}
