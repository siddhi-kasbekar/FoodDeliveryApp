package com.hexaware.hotbyte.service;

import com.hexaware.hotbyte.entity.Orders;

public interface IOrderService {

	public Long placeOrder(Orders order);

	public Orders getOrderById(Long orderId);

	public void updateOrderStatus(Long orderId, String status);
}
