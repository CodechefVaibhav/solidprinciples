package com.solid.principles.exercises.dip;

/**
 * @author praveen.krishna
 */

public class PDFExportService implements  FileExportService{
    
	@Override
	public void export(String data) {
		System.out.println("Exporting report to PDF: " + data);
	}
}