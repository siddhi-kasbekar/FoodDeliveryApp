package com.hexaware.hotbyte.service;

import java.util.List;

import com.hexaware.hotbyte.entity.Administrator;
import com.hexaware.hotbyte.entity.Customers;
import com.hexaware.hotbyte.entity.MenuItems;
import com.hexaware.hotbyte.entity.Orders;
import com.hexaware.hotbyte.entity.Restaurants;

public class AdminServiceImp implements IAdminService {

	@Override
	public String adminLogin(Administrator admin) {
		
		return null;
	}

	@Override
	public Restaurants addRestaurant(Restaurants restaurant) {
		
		return null;
	}

	@Override
	public void removeRestaurant(Long restaurantId) {
		
	
	}

	@Override
	public List<MenuItems> getAllMenus() {
		
		return null;
	}

	@Override
	public List<Restaurants> getAllRestaurants() {
		
		return null;
	}

	@Override
	public List<Orders> getAllOrders() {
		
		return null;
	}

	@Override
	public Restaurants addCustomers(Customers customer) {
		return null;
	}

	@Override
	public Restaurants addMenuItem(MenuItems menuItem) {
		return null;
	}

	@Override
	public void removeCustomers(Long custId) {
		
	}

	@Override
	public void removeMenuItems(Long menuItemId) {
		
	}

}
