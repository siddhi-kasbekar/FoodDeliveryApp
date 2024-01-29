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

	public Discount() {
		super();
	}

	public Discount(int discountId, Restaurants restaurant, BigDecimal discountPercentage, Date startDate,
			Date endDate) {
		super();
		this.discountId = discountId;
		this.restaurant = restaurant;
		this.discountPercentage = discountPercentage;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public Restaurants getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurants restaurant) {
		this.restaurant = restaurant;
	}

	public BigDecimal getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(BigDecimal discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Discount [discountId=" + discountId + ", restaurant=" + restaurant + ", discountPercentage="
				+ discountPercentage + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
    
    

}
