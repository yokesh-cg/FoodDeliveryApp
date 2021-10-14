package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.fooddeliveryapp.entity.OrderDetails;


public interface OrderRepository extends JpaRepository<OrderDetails, Integer>{
	
}