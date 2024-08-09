package com.solid.principles.srp.refactored.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solid.principles.srp.refactored.service.UserService;
import com.solid.principles.srp.refactored.service.UserValidatorService;
import com.solid.principles.srp.refactored.service.EmailService;

/**
 * @author vaibhav.kashyap
 */

@RestController("RefactoredController")
@RequestMapping("/refactored")
public class Controller {

	private final UserService userService;
	private final UserValidatorService userValidatorService;
	private final EmailService emailService;

	@Autowired
	public Controller(UserService userService, UserValidatorService userValidatorService, EmailService emailService) {
		this.userService = userService;
		this.userValidatorService = userValidatorService;
		this.emailService = emailService;
	}

	@PostMapping("/save")
	public String save() {
		return userService.saveToDatabase() + " user saved";
	}

	@GetMapping("/email")
	public String sendEmail(@RequestParam String email) {
		return emailService.sendWelcomeEmail(email);
	}

	@GetMapping("/validate/password")
	public boolean validatePassword(@RequestParam String password) {
		return userValidatorService.isValidPassword(password);
	}

	@GetMapping("/validate/email")
	public boolean validateEmail(@RequestParam String email) {
		return userValidatorService.isValidEmail(email);
	}
}
