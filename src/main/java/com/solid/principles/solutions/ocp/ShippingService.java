package com.solid.principles.solutions.ocp;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ShippingService {

    private final Map<String, ShippingStrategy> strategies = new HashMap<>();

    public ShippingService() {
        strategies.put("STANDARD", new StandardShippingStrategy());
        strategies.put("EXPRESS", new ExpressShippingStrategy());
    }

    public double calculateShippingCost(String method, double weight) {
        ShippingStrategy strategy = strategies.get(method);
        if (strategy != null) {
            return strategy.calculateShippingCost(weight);
        }
        return 0;
    }
}
