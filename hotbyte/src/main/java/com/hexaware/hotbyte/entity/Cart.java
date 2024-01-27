package com.hexaware.hotbyte.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	private int cartId;
	private double price;
	private int quantity;
	private double total;
	
	
	 @OneToOne
	    @JoinColumn(name = "custid")
	    private Customers customer;


	 @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
	    private Set<MenuItems> menuItemSet =  new HashSet<MenuItems>();;

	    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	    private Set<Orders> orderSet = new HashSet<Orders>();
	    
	    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	    private Set<Payment> paymentSet = new HashSet<Payment>();
	    
	 
    
    

}
