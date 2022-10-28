package com.example.paymentservice.service;

import com.example.paymentservice.entity.Payment;

public interface PaymentService {
    Payment doPay (Payment payment);
    String paymentStatus();
}
