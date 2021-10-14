package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import com.cg.project.fooddeliveryapp.entity.Customer;
import com.cg.project.fooddeliveryapp.entity.OrderDetails;
import com.cg.project.fooddeliveryapp.entity.Restaurant;

public interface IOrderService {
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails removeOrder(int id);
	public OrderDetails viewOrder(int id);
	public List<OrderDetails> viewAllOrders();
	
}
