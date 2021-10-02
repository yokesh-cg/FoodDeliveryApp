package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.fooddeliveryapp.entity.Bill;


public interface IBillRepository extends JpaRepository<Bill, String>{
	
}
