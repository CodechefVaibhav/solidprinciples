package com.solid.principles.exercises.dip;

/**
 * @author praveen.krishna
 */

public class Client {

    public static void main(String[] args) {
        // Generate and export report in PDF format
        String fileType = "PDF";
        ReportGenerator reportGenerator = new ReportGenerator(fileType);
        reportGenerator.generateReport("This is the report content");

    }

}
