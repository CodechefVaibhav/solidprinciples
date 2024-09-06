package com.solid.principles.exercises.dip;

import org.springframework.stereotype.Component;

@Component
public class FileExportServiceFactory {

    public static FileExportService createExporter(FileType type) {
        switch (type) {
            case PDF:
                return new PDFExportService();
            case EXCEL:
                return new ExcelExportService();
            case HTML:
                return new HtmlExportService();
            default:
                throw new IllegalArgumentException("Unknown export type: " + type);
        }
    }
    static enum FileType {
        PDF,
        EXCEL,
        HTML
    }
    
}
