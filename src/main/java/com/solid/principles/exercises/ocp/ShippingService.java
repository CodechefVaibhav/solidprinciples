package com.solid.principles.exercises.ocp;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ShippingService {

    public double calculateShippingCost(String method, double weight) {
        if ("STANDARD".equalsIgnoreCase(method)) {
            return weight * 1.0;
        } else if ("EXPRESS".equalsIgnoreCase(method)) {
            return weight * 2.0;
        }
        return 0;
    }
}
