package com.solid.principles.exercises.dip;

/**
 * @author vaibhav.kashyap
 */

public class ReportGenerator {

	private final ReportExporter reportExporter;

	public ReportGenerator(ReportExporter reportExporter) {
		this.reportExporter = reportExporter;
	}

	public void generateReport(String reportContent) {
		reportExporter.export(reportContent);
	}
}
