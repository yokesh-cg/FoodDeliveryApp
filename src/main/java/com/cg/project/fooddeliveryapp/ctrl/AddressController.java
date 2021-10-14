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

import com.cg.project.fooddeliveryapp.entity.Address;
import com.cg.project.fooddeliveryapp.service.IAddressService;

@RestController
@RequestMapping("/api")
public class AddressController {
	@Autowired
	IAddressService iAddressService;
	
	@PostMapping("/addresses")
	public Address addAddress(@RequestBody Address address) {
		return iAddressService.addAddress(address);		
	}
	
	@PutMapping("/addresses")
	public Address updateAddress(@RequestBody Address address) {
		return iAddressService.updateAddress(address);
	}
	
	@DeleteMapping("/addresses/{id}")
	public Address removeAddress(@PathVariable String id) {
		return iAddressService.removeAddress(id);
	}
	
	@GetMapping("/addresses")
	public List<Address> viewAddresss(){		
		return iAddressService.viewAddresss();
	}
	
	@GetMapping("/addresses/{id}")
	public Address viewAddresss(@PathVariable String id){
		return iAddressService.viewAddress(id);
	}

}
