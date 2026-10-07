package com.reycel.store;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder() {
        // var paymentService = new StripePaymentService();
        // Use interface to decouple OrderService from StripePaymentService
        paymentService.processPayment(10);
    }
}
