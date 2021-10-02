package com.cg.project.fooddeliveryapp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.Customer;
import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.service.ICustomerService;


@RestController
@RequestMapping("/api")
public class ICustomerController {
	
	@Autowired
	ICustomerService iCustomerService;
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return iCustomerService.addCustomer(customer);
	}
	
	@PostMapping("/updatecustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return iCustomerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/removecustomer")
	public Customer removeCustomer(@RequestBody Customer customer) {
		return iCustomerService.removeCustomer(customer);
	}
	
	@GetMapping("/viewcustomer")
	public Customer viewCustomer(@RequestBody Customer customer) {
		return iCustomerService.viewCustomer(customer);
	}
	
	@GetMapping("/viewallcustomer")
	public List<Customer> viewAllCustomers(@RequestBody Restaurant rest){
		return iCustomerService.viewAllCustomers(rest);
	}

}
