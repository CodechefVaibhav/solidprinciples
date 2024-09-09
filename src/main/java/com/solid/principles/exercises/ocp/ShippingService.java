package com.solid.principles.exercises.ocp;

import java.util.Map;
import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ShippingService {

    private final Map<String, ShippingUtils> shippingUtils;

    ShippingService(Map<String, ShippingUtils> shippingUtils) {
        this.shippingUtils = shippingUtils;
    }

    public double calculateShippingCost(String method, double weight) {
        if(shippingUtils.containsKey(method)){
            return shippingUtils.get(method).calculateShippingCost(weight);
        } else {
            throw new IllegalArgumentException("Unknown shipping method: " + method);
        }
    }
}
