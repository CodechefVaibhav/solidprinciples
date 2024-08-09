package com.solid.principles.isp.defective.service;

/**
 * @author vaibhav.kashyap
 */

public interface PrinterService {
	void print(String document);

	void scan(String document);

	void fax(String document);
}
