package com.hexaware.hotbyte.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class MenuItems {
	

	    @Id
	    private Long menuitemId;

	    private String itemName;

	    private String description;

	    private String category;

	    private Double price;

	    private String availabilityTime;

	    private String specialDietaryInfo;

	    private String tasteInfo;

	    private String nutritionalInfo;

	    private Integer cookingTime;

	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "RestaurantID")
	    private Restaurants restaurant;
	    
	    @OneToMany(mappedBy = "menuItem",cascade = CascadeType.ALL)
	    private Set<OrderDetails> orderDetailsSet = new HashSet<OrderDetails>();
	    
		@ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "CartID")
	    private Cart cart;
		
		@ManyToMany(mappedBy = "menuItems")
	    private Set<Orders> orders = new HashSet<>();



}
