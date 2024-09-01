package com.solid.principles.exercises.srp;

public class OrderClient {

    public static void main(String[] args) {
        // input -orderId
        String orderId = "12345";

        // Create instances of the services
        InvoiceServiceImpl invoiceService = new InvoiceServiceImpl();
        PaymentServiceImpl paymentService = new PaymentServiceImpl();

        // Create an instance of the OrderProcessingService
        OrderServiceImpl orderProcessingService = new OrderServiceImpl(invoiceService, paymentService);

        // Process the order
        orderProcessingService.processOrder(orderId);

    }

}
