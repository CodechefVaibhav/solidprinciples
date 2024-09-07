package com.solid.principles.exercises.isp;

public class Scanner implements Scannable {

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}
