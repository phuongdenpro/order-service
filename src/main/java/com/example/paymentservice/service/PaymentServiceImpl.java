package com.example.paymentservice.service;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.repository.PaymentRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService{
    static final String ORDER_BASE_URL = "http://localhost:3001/api/order";
    static final String PRODUCT_BASE_URL = "http://localhost:3000/api/product";
    static final String USER_BASE_URL = "http://localhost:8000/api/user";

    private static final Gson gson = new Gson();
    private final RestTemplate restTemplate = new RestTemplate();
    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public Payment doPay(Payment payment) {
        payment.setPaymentStatus(paymentStatus());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

    @Override
    public String paymentStatus() {
        return new Random().nextBoolean()?"success":"failure";
    }

    @Override
    public List<Payment> getListPayment() {
        return paymentRepository.findAll();
    }

    @Override
    public  String getStatusByPaymentId(int paymentId){
        Optional<Payment> payment = paymentRepository.findById(paymentId);
        return payment.isEmpty() ? "No find payment!" : payment.get().getPaymentStatus();
    }

}
