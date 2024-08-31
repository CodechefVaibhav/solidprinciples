package com.solid.principles.exercises.dip;

/**
 * @author praveen.krishna
 */

public class ReportClient {

    public static void main(String[] args) {

        // Generate and export report in PDF(input from user)

        ReportGenerator reportGenerator = new ReportGenerator(FileExportServiceFactory.FileType.PDF);
        reportGenerator.generateReport("This is the report content");

    }

}
