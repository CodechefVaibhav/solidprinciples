package com.solid.principles.solutions.dip;

public class ReportGenerator {

	private final ReportExporter reportExporter;

	public ReportGenerator(ReportExporter exporter) {
		this.reportExporter = new ReportExporter();
	}

	public void generateReport(String data) {
		reportExporter.export(data);
	}
}
