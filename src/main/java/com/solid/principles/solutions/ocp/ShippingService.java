package com.solid.principles.solutions.ocp;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double calculateShippingCost(ShippingType method, double weight) {
        return method.calculateCost(weight);
    }
}