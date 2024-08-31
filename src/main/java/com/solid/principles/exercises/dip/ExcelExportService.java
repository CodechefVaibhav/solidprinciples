package com.solid.principles.exercises.dip;

/**
 * @author praveen.krishna
 */

public class ExcelExportService implements FileExportService{

    @Override
	public void export(String data) {
		System.out.println("Exporting report to Excel: " + data);
	}
    
}
