package com.example.paymentservice.controller;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    public PaymentService paymentService;
    @PostMapping("/doPay")
    public Payment doPayment(@RequestBody Payment payment){
        return paymentService.doPay(payment);
    }
    @GetMapping("/list")
    public List<Payment> getListPayment(){
        return paymentService.getListPayment();
    }
    @GetMapping("/{paymentId}/status")
    public String getStatusByPaymentId (@PathVariable int paymentId){
        return paymentService.getStatusByPaymentId(paymentId);
    }
}
