package com.solid.principles.srp.defective.service;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public int saveToDatabase() {
        // Logic to connect to a database and save the user
        System.out.println("User saved to the database");
        return 1;
    }
}
