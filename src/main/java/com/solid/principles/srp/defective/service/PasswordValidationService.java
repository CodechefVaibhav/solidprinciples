package com.solid.principles.srp.defective.service;

import org.springframework.stereotype.Service;

@Service
public class PasswordValidationService {

    public boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}
