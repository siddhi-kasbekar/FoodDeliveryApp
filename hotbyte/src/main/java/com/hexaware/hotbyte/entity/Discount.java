package com.hexaware.hotbyte.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Discount {
	
	@Id
    @Column(name = "DiscountID")
    private int discountId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RestaurantID")
    private Restaurants restaurant;

    @Column(name = "DiscountPercentage")
    private BigDecimal discountPercentage;

    @Column(name = "StartDate")
    private Date startDate;

    @Column(name = "EndDate")
    private Date endDate;

}
