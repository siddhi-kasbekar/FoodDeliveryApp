package com.hexaware.hotbyte.service;

import java.util.List;

import com.hexaware.hotbyte.entity.Cart;

public interface ICartService {

	public Long addToCart(Long customerId, Long menuId, int quantity);

	public void removeFromCart(Long customerId, Long menuId);

	public void updateCartQuantity(Long customerId, Long menuId, int newQuantity);

	public List<Cart> getCartItems(Long userId);
}
