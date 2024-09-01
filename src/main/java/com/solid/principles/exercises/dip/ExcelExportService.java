package com.solid.principles.exercises.dip;

import org.springframework.stereotype.Service;

/**
 * @author praveen.krishna
 */

 @Service
public class ExcelExportService implements FileExportService{

    @Override
	public void export(String data) {
		System.out.println("Exporting report to Excel: " + data);
	}
    
}
