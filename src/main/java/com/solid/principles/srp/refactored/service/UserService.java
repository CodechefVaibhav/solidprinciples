package com.solid.principles.srp.refactored.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("UserService")
public class UserService {

	public int saveToDatabase() {
		// Logic to connect to a database and save the user
		System.out.println("User saved to the database");
		return 1;
	}
}
