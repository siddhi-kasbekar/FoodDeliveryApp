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
public class Orders {
	
	@Id
    @Column(name = "OrderID")
    private int orderId;
	
	@Column(name = "OrderDate")
    private Timestamp orderDate;

    @Column(name = "TotalCost", nullable = false)
    private BigDecimal totalCost;

    @Column(name = "Status")
    private String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CartID")
    private Cart cart;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "custID")
    private Customers customer;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "resId")
    private Restaurants restaurant;
	

}
