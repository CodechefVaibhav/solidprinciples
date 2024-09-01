package com.solid.principles.solutions.isp;

/**
 * The interface Scanning device.
 */
public interface ScanningDevice {

    /**
     * Scan.
     *
     * @param document the document
     */
    void scan(String document);
}
