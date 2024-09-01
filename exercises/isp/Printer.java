package com.solid.principles.exercises.isp;

public class Printer implements Printable {

    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}
