package com.solid.principles.exercises.dip;

public class ExcelExporter implements Exporter {

    @Override
    public void export(String data) {
        System.out.println("Exporting report to Excel: " + data);
    }
}
