package com.cg.project.fooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.Address;
import com.cg.project.fooddeliveryapp.entity.Bill;
import com.cg.project.fooddeliveryapp.entity.Customer;
import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.repository.CustomerRepository;


@Service
public class ICustomerServiceImpl implements ICustomerService{
@Autowired
CustomerRepository customerRepository;
	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		customerRepository.findById(customer.getCustomerId()).orElseThrow(
						() -> new EntityNotFoundException("No Customers found"));
		return customerRepository.saveAndFlush(customer);
	}


	@Override
	public Customer viewCustomer(String customerId) {
		Optional<Customer> customContainer = customerRepository.findById(customerId);
		if(customContainer.isPresent()) {
			return customContainer.get();
		}

		return null;
	}

	@Override
	public List<Customer> viewAllCustomers() {
		return customerRepository.findAll();
	}

}
