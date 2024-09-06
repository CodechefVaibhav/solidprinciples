package com.solid.principles.exercises.dip;

import org.springframework.beans.factory.annotation.Autowired;

import com.solid.principles.exercises.dip.FileExportServiceFactory.FileType;

/**
 * @author praveen.krishna
 */

public class ReportServiceImpl implements ReportService {

	private final FileExportService fileExporter;

	@Autowired
	public ReportServiceImpl(FileType fileType) {
		this.fileExporter = FileExportServiceFactory.createExporter(fileType);
	}

	@Override
	public void generateReport(String data) {
		fileExporter.export(data);
	}
}
