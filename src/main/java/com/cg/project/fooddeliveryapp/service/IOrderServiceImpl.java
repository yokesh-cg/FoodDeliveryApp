package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.Customer;
import com.cg.project.fooddeliveryapp.entity.OrderDetails;
import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.repository.OrderRepository;

@Service
public class IOrderServiceImpl implements IOrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		orderRepository.findById(order.getOrderid()).orElseThrow(
				() -> new EntityNotFoundException("no Order Details found by the id"));
		return orderRepository.saveAndFlush(order);
	}

	@Override
	public OrderDetails removeOrder(int id) {
		// TODO Auto-generated method stub
		OrderDetails order = orderRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("No Orders found"));
		orderRepository.delete(order);
		return order;
	}

	@Override
	public OrderDetails viewOrder(int id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("No Order Details Found"));
	}

	@Override
	public List<OrderDetails> viewAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}
