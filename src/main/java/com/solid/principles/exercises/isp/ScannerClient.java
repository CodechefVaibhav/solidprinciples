package com.solid.principles.exercises.isp;

public class ScannerClient {

    ScannerService scannerService;

    ScannerClient(ScannerService scannerService){
        this.scannerService = scannerService;
    }


    public void scannerOperation(String document) {
        System.out.println("Starting scan operation...");
        scannerService.scan(document);
        System.out.println("Scan operation completed.");
    }
    
}
