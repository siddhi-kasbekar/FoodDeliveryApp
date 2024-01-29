package com.hexaware.hotbyte.service;

import com.hexaware.hotbyte.entity.Customers;
import com.hexaware.hotbyte.entity.Restaurants;

public interface IDashboardService {

	public Customers getUserDashboard(Long customerId);

	public Restaurants getRestaurantDashboard(Long restaurantId);
}
