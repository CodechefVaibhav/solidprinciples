package com.solid.principles.srp.defective.service;

import org.springframework.stereotype.Service;

@Service
public class EmailValidationService {

    public boolean isValidEmail(String email) {
        return email.contains("@");
    }
}
