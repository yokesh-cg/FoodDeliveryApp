package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.fooddeliveryapp.entity.Restaurant;


public interface IRestaurantRepository extends JpaRepository<Restaurant, String>{
	
}
