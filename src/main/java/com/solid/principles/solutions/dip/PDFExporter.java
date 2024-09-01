package com.solid.principles.solutions.dip;

import org.springframework.stereotype.Component;

/**
 * The type Pdf exporter.
 *
 * @author himanshu.pandey
 */
@Component
public class PDFExporter implements ReportExporter {

	@Override
	public void export(String data) {
		System.out.println("Exporting report to PDF: " + data);
	}
}