package com.solid.principles.dip.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class EmailNotificationService {
	public void sendEmail(String message) {
		System.out.println("Sending email: " + message);
	}
}
