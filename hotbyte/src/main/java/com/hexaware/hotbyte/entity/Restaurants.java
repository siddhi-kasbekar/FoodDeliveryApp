package com.hexaware.hotbyte.entity;

import java.awt.MenuItem;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Restaurants {

    @Id
    private int restaurantId;
    
    private String name;

    private String location;

    private String contactNumber;

    private Double rating = 0.0;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "resId")
	private Set<MenuItems> menuItemSet = new HashSet<MenuItems>(); // collections should be initialized to avoid nullPoitner Escep

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    @JoinColumn(name = "resId")
    private Set<Orders> orderSet = new HashSet<Orders>();
    
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    @JoinColumn(name = "resId")
    private Set<Discount> discountSet = new HashSet<Discount>() ;



}
