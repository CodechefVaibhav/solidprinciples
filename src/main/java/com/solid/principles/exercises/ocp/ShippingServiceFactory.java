package com.solid.principles.exercises.ocp;

public class ShippingServiceFactory {

    public static ShippingService createShippingService(ServiceType type) {
        switch (type) {
            case EXPRESS:
                return new ExpressShippingService();
            case STANDARD:
                return new StandardShippingService();
            default:
                throw new IllegalArgumentException("Unknown service type: " + type);
        }
    }

    static enum ServiceType {
        EXPRESS,
        STANDARD
    }
}
