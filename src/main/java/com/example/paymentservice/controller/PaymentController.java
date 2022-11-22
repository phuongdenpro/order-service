package com.example.paymentservice.controller;

import com.example.paymentservice.entity.TransactionDetails;
import com.example.paymentservice.model.PaymentRequest;
import com.example.paymentservice.model.PaymentResponse;
import com.example.paymentservice.service.PaymentService;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    private static final String PAYMENT_SERVICE = "paymentService";

    @PostMapping("/doPay/{covenantId}")
    @Retry(name = PAYMENT_SERVICE)
    public ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest, @PathVariable String covenantId) {
        return new ResponseEntity<>(
                paymentService.doPayment(paymentRequest, covenantId),
                HttpStatus.OK
        );
    }

    @GetMapping("/covenant/{covenantId}")
    public ResponseEntity<PaymentResponse> getPaymentDetailsByOrderId(@PathVariable String covenantId) {
        return new ResponseEntity<>(
                paymentService.getPaymentDetailsByCovenantId(covenantId),
                HttpStatus.OK
        );
    }

}
