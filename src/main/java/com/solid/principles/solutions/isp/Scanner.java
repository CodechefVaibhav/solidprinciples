package com.solid.principles.solutions.isp;

/**
 * The type Scanner.
 */
public class Scanner implements ScanningDevice {
    /**
     * @param document
     */
    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}