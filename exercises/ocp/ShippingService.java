package com.solid.principles.exercises.ocp;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Khalid.najam
 */

@Service
public class ShippingService {

    private final Map<String, ShippingStrategy> strategies = new HashMap<>();

    public ShippingService() {
        strategies.put("STANDARD", new StandardShipping());
        strategies.put("EXPRESS", new ExpressShipping());
        // Additional strategies can be added here without modifying existing code
    }

    public double calculateShippingCost(String method, double weight) {
        ShippingStrategy strategy = strategies.get(method.toUpperCase());
        if (strategy != null) {
            return strategy.calculateCost(weight);
        }
        throw new IllegalArgumentException("Invalid shipping method: " + method);
    }
}