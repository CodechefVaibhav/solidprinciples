package com.solid.principles.srp.refactored.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class EmailService {

	public String sendWelcomeEmail(String email) {
		// Logic to send an email
		return "Welcome email sent to " + email;
	}
}
