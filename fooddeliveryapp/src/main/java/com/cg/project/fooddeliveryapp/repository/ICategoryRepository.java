package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.fooddeliveryapp.entity.Category;



public interface ICategoryRepository extends JpaRepository<Category, String>{
	
}