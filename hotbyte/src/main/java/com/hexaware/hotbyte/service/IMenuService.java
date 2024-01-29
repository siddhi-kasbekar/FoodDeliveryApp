package com.hexaware.hotbyte.service;

import java.util.List;

import com.hexaware.hotbyte.entity.MenuItems;

public interface IMenuService {

	public List<MenuItems> getMenuByCategory(String category);

	public List<MenuItems> searchMenuItems(String keyword);
}
