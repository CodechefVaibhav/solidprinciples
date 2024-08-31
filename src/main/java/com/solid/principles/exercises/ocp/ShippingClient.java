package com.solid.principles.exercises.ocp;

import org.springframework.stereotype.Service;

/**
 * @author praveen.krishna
 */

@Service
public class ShippingClient {

    public static void main(String[] args) {

        // User Input - ServiceType && weight

        // for Express Services
        ShippingService expressService = ShippingServiceFactory
                .createShippingService(ShippingServiceFactory.ServiceType.EXPRESS);
        expressService.calculateCost(10);

        // for Standard Service
        ShippingService standardService = ShippingServiceFactory
                .createShippingService(ShippingServiceFactory.ServiceType.STANDARD);
        standardService.calculateCost(10);
    }
}
