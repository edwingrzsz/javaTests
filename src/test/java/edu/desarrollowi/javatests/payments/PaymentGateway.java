package edu.desarrollowi.javatests.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
