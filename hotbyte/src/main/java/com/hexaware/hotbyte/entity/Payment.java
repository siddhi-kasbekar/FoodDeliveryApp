package com.hexaware.hotbyte.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payment {
	
	@Id
    @Column(name = "PaymentID")
    private int paymentId;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserID")
    private Customers customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CartID")
    private Cart cart;

    @Column(name = "PaymentDate", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp paymentDate;

    @Column(name = "Amount")
    private BigDecimal amount;

    @Column(name = "PaymentMethod")
    private String paymentMethod;

    @Column(name = "TransactionID")
    private String transactionID;

}
