package com.solid.principles.exercises.dip;

public class MainClass {
    public  void runit() {

        ReportExporter pdfExporter = new PDFExporter();
        ReportGenerator reportGenerator = new ReportGenerator(pdfExporter);
        reportGenerator.generateReport("This is the report content.");
        ReportExporter excelExporter = new ExcelExporter();
        ReportGenerator excelReportGenerator = new ReportGenerator(excelExporter);
        excelReportGenerator.generateReport("This is the report content.");
    }
}
