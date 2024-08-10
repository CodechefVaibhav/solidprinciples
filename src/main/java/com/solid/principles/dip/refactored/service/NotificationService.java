package com.solid.principles.dip.refactored.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author vaibhav.kashyap
 */

@Service("RefactoredNotificationService")
public class NotificationService {

	private final Map<String, NotificationSender> notificationSenders;

	@Autowired
	public NotificationService(Map<String, NotificationSender> notificationSenders) {
		this.notificationSenders = notificationSenders;
	}

	public void sendNotification(String type, String message) {
		NotificationSender sender = notificationSenders.get(type.toLowerCase());
		if (sender != null) {
			sender.send(message);
		} else {
			throw new IllegalArgumentException("Unknown notification type");
		}
	}
}
