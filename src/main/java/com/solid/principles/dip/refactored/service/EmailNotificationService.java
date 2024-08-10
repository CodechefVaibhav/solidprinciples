package com.solid.principles.dip.refactored.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("RefactoredEmailNotificationService")
public class EmailNotificationService implements NotificationSender {

	@Override
	public void send(String message) {
		System.out.println("Sending email: " + message);
	}
}