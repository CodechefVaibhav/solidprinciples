package com.solid.principles.exercises.dip;

import com.solid.principles.exercises.dip.FileExportServiceFactory.FileType;

/**
 * @author praveen.krishna
 */

public class ReportGenerator {

	private final FileExportService fileExporter;

	public ReportGenerator(FileType fileType) {
		this.fileExporter = FileExportServiceFactory.createExporter(fileType);
	}

	public void generateReport(String data) {
		fileExporter.export(data);
	}
}
