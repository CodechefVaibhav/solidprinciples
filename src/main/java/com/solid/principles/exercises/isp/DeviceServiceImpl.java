package com.solid.principles.exercises.isp;

/**
 * @author praveen.krishna
 */

public class DeviceServiceImpl implements PrinterService, ScannerService{

    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }
    
}
