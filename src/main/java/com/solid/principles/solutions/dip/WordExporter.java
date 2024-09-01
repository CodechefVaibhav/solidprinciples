package com.solid.principles.solutions.dip;

import org.springframework.stereotype.Component;

/**
 * The type Word exporter.
 * @author himanshu.pandey
 */
@Component
public class WordExporter implements ReportExporter{
    /**
     * @param data the data
     */
    @Override
    public void export(String data) {
        System.out.println("Exporting report to Word: " + data);
    }
}