package com.solid.principles.srp.defective.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solid.principles.srp.defective.service.UserService;

/**
 * @author vaibhav.kashyap
 */

@RestController("DefectiveController")
@RequestMapping("/defective")
public class Controller {

	private final UserService userService;

	public Controller(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/save")
	public String save() {
		return userService.saveToDatabase() + " user saved";
	}

	@GetMapping("/email")
	public String sendEmail(@RequestParam String email) {
		return userService.sendWelcomeEmail(email);
	}

	@GetMapping("/validate/password")
	public boolean validatePassword(@RequestParam String password) {
		return userService.isValidEmail(password);
	}

	@GetMapping("/validate/email")
	public boolean validateEmail(@RequestParam String email) {
		return userService.isValidEmail(email);
	}

}
