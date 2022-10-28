package com.example.paymentservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_payment")
public class Payment {
    @Id
    @GeneratedValue
    private int paymentId;
    private String paymentStatus;
    private String transacsionId;
    private int orderId;
    private double totalAmount;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return totalAmount;
    }

    public void setAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTransacsionId() {
        return transacsionId;
    }

    public void setTransacsionId(String txId) {
        this.transacsionId = transacsionId;
    }
}