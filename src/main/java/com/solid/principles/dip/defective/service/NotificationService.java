package com.solid.principles.dip.defective.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class NotificationService {

	private final EmailNotificationService emailNotificationService;
	private final SMSNotificationService smsNotificationService;

	@Autowired
	public NotificationService(EmailNotificationService emailNotificationService,
			SMSNotificationService smsNotificationService) {
		this.emailNotificationService = emailNotificationService;
		this.smsNotificationService = smsNotificationService;
	}

	public void sendNotification(String type, String message) {
		if ("email".equalsIgnoreCase(type)) {
			emailNotificationService.sendEmail(message);
		} else if ("sms".equalsIgnoreCase(type)) {
			smsNotificationService.sendSMS(message);
		} else {
			throw new IllegalArgumentException("Unknown notification type");
		}
	}
}
