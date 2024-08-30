package com.solid.principles.exercises.ocp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingService {

    private final List<ShippingMethod> shippingMethods;

    @Autowired
    public ShippingService(List<ShippingMethod> shippingMethods) {
        this.shippingMethods = shippingMethods;
    }

    public double calculateShippingCost(String method, double weight) {
        for (ShippingMethod shippingMethod : shippingMethods) {
            if (shippingMethod.getMethodName().equalsIgnoreCase(method)) {
                return shippingMethod.calculateCost(weight);
            }
        }
        throw new IllegalArgumentException("Unknown shipping method: " + method);
    }
}
