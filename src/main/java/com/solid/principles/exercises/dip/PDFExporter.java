package com.solid.principles.exercises.dip;

/**
 * @author vaibhav.kashyap
 */

public class PDFExporter implements ReportExporter {
	@Override
	public void export(String reportContent) {

		System.out.println("Exporting report to PDF format.");
	}
}
