package com.hexaware.hotbyte.service;

import java.util.List;

import com.hexaware.hotbyte.entity.MenuItems;
import com.hexaware.hotbyte.entity.Restaurants;

public interface IRestaurantService {

	public Long registerRestaurant(Restaurants restaurant);

	public String loginRestaurant(Restaurants restaurant);

	public void addMenu(MenuItems menuDTO);

	public void updateMenu(MenuItems menu);

	public void deleteMenu(Long menuId);

	public List<MenuItems> getMenuByCategory(String category);

	public List<MenuItems> getOrdersByRestaurantId(Long restaurantId);

}
