package com.solid.principles.exercises.dip;

public class HtmlExporter implements ReportExporter {
    @Override
    public void export(String reportContent) {

        System.out.println("Exporting report to HTML format.");
    }
}