package com.example.paymentservice.service;

import com.example.paymentservice.entity.Payment;

import java.util.List;

public interface PaymentService {
    Payment doPay (Payment payment);
    String paymentStatus();
    List<Payment> getListPayment();
    String getStatusByPaymentId(int paymentId);
}
