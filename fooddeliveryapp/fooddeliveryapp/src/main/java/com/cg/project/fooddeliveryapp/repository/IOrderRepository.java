package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.fooddeliveryapp.entity.OrderDetails;


public interface IOrderRepository extends JpaRepository<OrderDetails, Integer>{
	
}