package com.solid.principles.exercises.dip;

/**
 * @author praveen.krishna
 */

public class ReportGenerator {

	private final FileExporterInterface fileExporter;

	public ReportGenerator(String fileType) {
		this.fileExporter = FactoryExportor.createExporter(fileType);
	}

	public void generateReport(String data) {
		fileExporter.export(data);
	}
}
