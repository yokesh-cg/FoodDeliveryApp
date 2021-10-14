package com.cg.project.fooddeliveryapp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.Customer;
import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.service.ICustomerService;


@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	ICustomerService iCustomerService;
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		return iCustomerService.addCustomer(customer);
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return iCustomerService.updateCustomer(customer);
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer viewCustomer(@PathVariable String customerId) {
		return iCustomerService.viewCustomer(customerId);
	}
	
	@GetMapping("/customers")
	public List<Customer> viewAllCustomers(){
		return iCustomerService.viewAllCustomers();
	}

}
