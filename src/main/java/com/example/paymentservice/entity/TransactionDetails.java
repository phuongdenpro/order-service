package com.example.paymentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "TRANSACTION_DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;
    private Long covenantId;
    private Instant paymentDate;
    private String paymentStatus;
    private long amount;
    //    @Column(name = "MODE")
//    private String paymentMode;

//    @Column(name = "REFERENCE_NUMBER")
//    private String referenceNumber;
}