package com.solid.principles.exercises.isp;

/**
 * @author Khalid.najam
 */

public class PrinterPrblm implements Printable, Scannable {

    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}