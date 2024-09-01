package com.solid.principles.exercises.ocp;

import org.springframework.stereotype.Service;


/**
 * @author shubhang21
 */


@Service
public class ShippingService {

    public double calculateShippingCost(String method, double weight) {
        return weight * ShippingMethod.valueOf(method).getRate();
    }
}
