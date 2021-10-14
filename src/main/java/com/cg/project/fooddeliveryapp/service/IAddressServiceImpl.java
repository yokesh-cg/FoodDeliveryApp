package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import com.cg.project.fooddeliveryapp.entity.Address;
import com.cg.project.fooddeliveryapp.repository.AddressRepository;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IAddressServiceImpl implements IAddressService {
	
	@Autowired
	AddressRepository addressRepo;
	@Override
	public Address addAddress(Address address) {
		return addressRepo.save(address);
	}

	@Override
	public Address updateAddress(Address address) {
		Address  a = addressRepo.findById(address.getAddressid()).orElseThrow(
				() -> new EntityNotFoundException("no Address found by the id" + address.getAddressid()));
		return addressRepo.saveAndFlush(address);
	}

	@Override
	public Address removeAddress(String addressId) {
		Address  a = addressRepo.findById(addressId).orElseThrow(
				() -> new EntityNotFoundException("no Address found by the id" + addressId));
		addressRepo.delete(a);
		return a;
	}

	@Override
	public List<Address> viewAddresss() {
		return addressRepo.findAll();
	}

	@Override
	public Address viewAddress(String id) {
		return addressRepo.findById(id).orElseThrow(
				() -> new EntityNotFoundException("no Address found by the id"));
		
	}

}
