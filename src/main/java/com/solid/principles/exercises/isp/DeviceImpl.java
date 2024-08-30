package com.solid.principles.exercises.isp;

public class DeviceImpl implements DeviceInterface{

    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }
    
}
