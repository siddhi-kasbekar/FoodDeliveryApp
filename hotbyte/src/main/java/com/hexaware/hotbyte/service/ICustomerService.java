package com.hexaware.hotbyte.service;

import java.util.List;

import com.hexaware.hotbyte.entity.Customers;
import com.hexaware.hotbyte.entity.Restaurants;

public interface ICustomerService {

	public long registerCustomer(Customers customer);

	public String loginCustomer(Customers customer);
	
	public List<Restaurants> getRestaurantByLocation(String location);

}
