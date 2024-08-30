package com.solid.principles.exercises.isp;

public class OfficePrinter implements Printer {
    @Override
    public void print(Document document) {

        System.out.println("Printing document: " + document.getContent());
    }
}