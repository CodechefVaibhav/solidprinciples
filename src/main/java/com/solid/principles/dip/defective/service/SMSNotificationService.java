package com.solid.principles.dip.defective.service;

import com.solid.principles.dip.defective.components.NotificationSender;
import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class SMSNotificationService implements NotificationSender {
	public void sendNotification(String message) {
		System.out.println("Sending SMS: " + message);
	}
}