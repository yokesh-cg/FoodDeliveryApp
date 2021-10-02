package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.fooddeliveryapp.entity.Customer;


public interface ICustomerRepository extends JpaRepository<Customer, String>{
	
}