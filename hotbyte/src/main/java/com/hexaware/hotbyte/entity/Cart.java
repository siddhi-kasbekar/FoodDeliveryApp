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

		public Cart() {
			super();
		}

		public Cart(int cartId, double price, int quantity, double total, Customers customer) {
			super();
			this.cartId = cartId;
			this.price = price;
			this.quantity = quantity;
			this.total = total;
			this.customer = customer;
		}

		public int getCartId() {
			return cartId;
		}

		public void setCartId(int cartId) {
			this.cartId = cartId;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public Customers getCustomer() {
			return customer;
		}

		public void setCustomer(Customers customer) {
			this.customer = customer;
		}

		public Set<MenuItems> getMenuItemSet() {
			return menuItemSet;
		}

		public void setMenuItemSet(Set<MenuItems> menuItemSet) {
			this.menuItemSet = menuItemSet;
		}

		public Set<Orders> getOrderSet() {
			return orderSet;
		}

		public void setOrderSet(Set<Orders> orderSet) {
			this.orderSet = orderSet;
		}

		public Set<Payment> getPaymentSet() {
			return paymentSet;
		}

		public void setPaymentSet(Set<Payment> paymentSet) {
			this.paymentSet = paymentSet;
		}
	    
	    
	    
	    
	 
    
    

}
