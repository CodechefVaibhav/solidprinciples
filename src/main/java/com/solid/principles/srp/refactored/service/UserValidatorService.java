package com.solid.principles.srp.refactored.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class UserValidatorService {

	public boolean isValidEmail(String email) {
		return email != null && email.contains("@");
	}

	public boolean isValidPassword(String password) {
		return password != null && password.length() >= 8;
	}
}
