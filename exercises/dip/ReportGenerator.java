package com.solid.principles.exercises.dip;

/**
 * @author Khalid.najam
 */

public class ReportGenerator {

	private final Exporter reportExporter;

	public ReportGenerator(Exporter reportExporter) {
		this.reportExporter = reportExporter;
	}

	public void generateReport(String data) {
		reportExporter.export(data);
	}
}