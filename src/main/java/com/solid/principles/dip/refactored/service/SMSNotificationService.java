package com.solid.principles.dip.refactored.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("RefactoredSMSNotificationService")
public class SMSNotificationService implements NotificationSender {

	@Override
	public void send(String message) {
		System.out.println("Sending SMS: " + message);
	}
}
