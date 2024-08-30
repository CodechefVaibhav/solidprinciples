package com.solid.principles.exercises.isp;

/**
 * @author yash.agarwal
 */

public class ScannerPrblm implements Scanner {

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }

}
