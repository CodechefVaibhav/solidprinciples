package com.solid.principles.exercises.dip;

/**
 * @author shubhang21
 */

public class ExcelExporter implements ReportExporter {
    @Override
    public void export(String data) {
        System.out.println("Exporting report to Excel: " + data);
    }
}
