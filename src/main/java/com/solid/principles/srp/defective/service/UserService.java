package com.solid.principles.srp.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("DefectiveUserService")
public class UserService {

	public UserService() {

	}

	// Validate email format
	public boolean isValidEmail(String email) {
		return email.contains("@");
	}

	// Validate password strength
	public boolean isValidPassword(String password) {
		return password.length() >= 8;
	}

	// Save user to the database
	public int saveToDatabase() {
		// Logic to connect to a database and save the user
		System.out.println("User saved to the database");
		return 1;
	}

	// Send a welcome email
	public String sendWelcomeEmail(String email) {
		// Logic to send an email
		return "Welcome email sent to " + email;
	}
}
