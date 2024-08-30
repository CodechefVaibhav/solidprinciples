package com.solid.principles.exercises.isp;

public class OfficeScanner implements Scanner {
    @Override
    public void scan(Document document) {
        System.out.println("Scanning document: " + document.getContent());
    }
}