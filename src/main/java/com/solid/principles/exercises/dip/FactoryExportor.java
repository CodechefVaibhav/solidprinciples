package com.solid.principles.exercises.dip;

public class FactoryExportor {

    public static FileExporterInterface createExporter(String type) {
        switch (type.toUpperCase()) {
            case "PDF":
                return new PDFExporter();
            case "EXCEL":
                return new ExcelExportor();
            case "HTML":
                return new HtmlExportor();
            default:
                throw new IllegalArgumentException("Unknown export type: " + type);
        }
    }

    
}
