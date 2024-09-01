
package com.solid.principles.exercises.dip;

/**
 * @author shubhang21
 */

public class HTMLExporter implements ReportExporter {
    @Override
    public void export(String data) {
        System.out.println("Exporting report to HTML: " + data);
    }
}
