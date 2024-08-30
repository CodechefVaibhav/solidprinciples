package com.solid.principles.exercises.isp;

public class MultiFunctionDevice implements Printer, Scanner {
    @Override
    public void print(Document document) {

        System.out.println("Printing document: " + document.getContent());
    }

    @Override
    public void scan(Document document) {

        System.out.println("Scanning document: " + document.getContent());
    }
}
