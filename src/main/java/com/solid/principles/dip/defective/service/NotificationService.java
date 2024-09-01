package com.solid.principles.dip.defective.service;

import com.solid.principles.dip.defective.components.NotificationSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author vaibhav.kashyap
 */

@Service
public class NotificationService {

	private final Map<String, NotificationSender> notificationMethods;

 	@Autowired
	public NotificationService( Map<String, NotificationSender> notificationMethods) {
		this.notificationMethods = notificationMethods;
	}

	public void sendNotification(String type, String message) {
		System.out.println("value of map : " + notificationMethods);
		if (notificationMethods.containsKey(type)) {
			notificationMethods.get(type).sendNotification(message);
		} else {
			throw new IllegalArgumentException("Unknown notification type");
		}
	}
}
