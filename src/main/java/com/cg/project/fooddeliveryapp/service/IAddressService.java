package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import com.cg.project.fooddeliveryapp.entity.Address;


public interface IAddressService {
	public Address addAddress(Address Address);
	public Address updateAddress(Address Address);
	public Address removeAddress(String id);
	public List<Address> viewAddresss();
	public Address viewAddress(String id);
	
}
