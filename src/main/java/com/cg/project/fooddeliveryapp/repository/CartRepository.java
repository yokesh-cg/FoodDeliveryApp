package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.fooddeliveryapp.entity.FoodCart;



public interface CartRepository extends JpaRepository<FoodCart, String>{
	
}