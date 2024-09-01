package com.solid.principles.exercises.isp;

/**
 * @author shubhang21
 */

public class Scanner implements Scannable {

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }
    
}
