package com.solid.principles.dip.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class SMSNotificationService {
	public void sendSMS(String message) {
		System.out.println("Sending SMS: " + message);
	}
}