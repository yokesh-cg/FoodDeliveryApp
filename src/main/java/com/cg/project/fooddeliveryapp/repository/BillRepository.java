package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.project.fooddeliveryapp.entity.Bill;


public interface BillRepository extends JpaRepository<Bill, String>{
	
	
}
