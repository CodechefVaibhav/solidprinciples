package com.solid.principles.dip.refactored.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solid.principles.dip.refactored.service.NotificationService;

/**
 * @author vaibhav.kashyap
 */

@RestController("RefactoredNotificationController")
@RequestMapping("/refactored/notification")
public class NotificationController {

	private final NotificationService notificationService;

	public NotificationController(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@PostMapping("/send")
	public String sendNotification(@RequestParam String type, @RequestParam String message) {
		notificationService.sendNotification(type, message);
		return "Notification sent: " + message;
	}
}
