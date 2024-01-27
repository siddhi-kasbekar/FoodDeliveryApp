package com.hexaware.hotbyte.entity;

import java.awt.MenuItem;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {
	@Id
    @Column(name = "OrderDetailID")
    private int orderDetailId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrderID")
    private Orders order;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MenuID")
    private MenuItems menuItem;

    private int quantity;

}
