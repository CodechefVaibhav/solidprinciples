package com.solid.principles.exercises.ocp.services;

import com.solid.principles.exercises.ocp.enums.ShippingType;
import com.solid.principles.exercises.ocp.factories.ShippingMethodFactory;
import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ShippingService {

    private final ShippingMethodFactory shippingMethodFactory;

    public ShippingService(ShippingMethodFactory shippingMethodFactory) {
        this.shippingMethodFactory = shippingMethodFactory;
    }

    public double calculateShippingCost(ShippingType shippingType, double weight) {
        Shipping shipping = shippingMethodFactory.createShipping(shippingType);
        return shipping.calculateShippingCost(weight);
    }
}
