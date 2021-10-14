package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.project.fooddeliveryapp.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{
	
}