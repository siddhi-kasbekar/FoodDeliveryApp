package com.hexaware.hotbyte.service;

import java.util.List;

import com.hexaware.hotbyte.entity.Administrator;
import com.hexaware.hotbyte.entity.Customers;
import com.hexaware.hotbyte.entity.MenuItems;
import com.hexaware.hotbyte.entity.Orders;
import com.hexaware.hotbyte.entity.Restaurants;

public interface IAdminService {

	public String adminLogin(Administrator admin);

	public Restaurants addRestaurant(Restaurants restaurant);
	
	public Restaurants addCustomers(Customers customer);
	public Restaurants addMenuItem(MenuItems menuItem);
	
	public void removeCustomers(Long custId);
	public void removeMenuItems(Long menuItemId);



	public void removeRestaurant(Long restaurantId);

	public List<MenuItems> getAllMenus();

	public List<Restaurants> getAllRestaurants();

	public List<Orders> getAllOrders();
}
