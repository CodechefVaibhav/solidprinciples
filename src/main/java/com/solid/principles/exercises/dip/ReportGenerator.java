package com.solid.principles.exercises.dip;

/**
 * @author yash.agarwal
 */

public class ReportGenerator {

	private final FileExporter fileExporter;

	public ReportGenerator(FileExporter fileExporter) {
		this.fileExporter = fileExporter;
	}

	public void generateReport(String data) {
		fileExporter.export(data);
	}
}
