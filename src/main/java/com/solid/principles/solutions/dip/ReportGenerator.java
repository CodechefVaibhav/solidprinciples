package com.solid.principles.solutions.dip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * The type Report generator.
 *
 * @author himanshu.pandey
 */
@Component
public class ReportGenerator {

	private final ReportExporter reportExporter;

	/**
	 * Instantiates a new Report generator.
	 *
	 * @param reportExporter the pdf exporter
	 */
	@Autowired
	public ReportGenerator(@Qualifier("PDFExporter") ReportExporter reportExporter) {
		this.reportExporter = reportExporter;
	}

	/**
	 * Generate report.
	 *
	 * @param data the data
	 */
	public void generateReport(String data) {
		reportExporter.export(data);
	}
}
