package com.solid.principles.exercises.dip;

public class ExcelExporter implements ReportExporter {
    @Override
    public void export(String reportContent) {

        System.out.println("Exporting report to Excel format.");
    }
}
