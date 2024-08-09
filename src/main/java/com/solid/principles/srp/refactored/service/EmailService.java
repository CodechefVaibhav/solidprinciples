package com.solid.principles.srp.refactored.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

	public String sendWelcomeEmail(String email) {
		// Logic to send an email
		return "Welcome email sent to " + email;
	}
}
