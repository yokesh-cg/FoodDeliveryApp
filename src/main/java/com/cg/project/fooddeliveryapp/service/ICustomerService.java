package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import com.cg.project.fooddeliveryapp.entity.Customer;
import com.cg.project.fooddeliveryapp.entity.Restaurant;


public interface ICustomerService {
	
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	//public Customer removeCustomer(String customerId);
	public Customer viewCustomer(String customerId);
	public List<Customer> viewAllCustomers();
	
}
