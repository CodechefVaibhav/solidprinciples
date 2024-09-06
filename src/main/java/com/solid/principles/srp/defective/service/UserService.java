package com.solid.principles.srp.defective.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private final EmailValidationService emailValidationService;
	private final PasswordValidationService passwordValidationService;
	private final UserRepository userRepository;
	private final EmailService emailService;

	@Autowired
	public UserService(EmailValidationService emailValidationService,
					   PasswordValidationService passwordValidationService,
					   UserRepository userRepository,
					   EmailService emailService) {
		this.emailValidationService = emailValidationService;
		this.passwordValidationService = passwordValidationService;
		this.userRepository = userRepository;
		this.emailService = emailService;
	}

	public boolean isValidEmail(String email) {
		return emailValidationService.isValidEmail(email);
	}

	public boolean isValidPassword(String password) {
		return passwordValidationService.isValidPassword(password);
	}

	public int saveToDatabase() {
		return userRepository.saveToDatabase();
	}

	public String sendWelcomeEmail(String email) {
		return emailService.sendWelcomeEmail(email);
	}
}
