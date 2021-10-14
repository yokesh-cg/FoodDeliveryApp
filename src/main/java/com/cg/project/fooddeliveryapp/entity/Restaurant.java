package com.cg.project.fooddeliveryapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;



@Entity(name="Restaurant")
public class Restaurant {
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	String restaurantid;
	String restaurantname;
	
	@OneToOne(cascade=CascadeType.ALL)
	Address address;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "restaurant_id")
	List<Item> itemList;
	
	
	String managername;
	String contactnumber;
	
	public Restaurant() {
		super();
	}
	public String getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(String restaurantid) {
		this.restaurantid = restaurantid;
	}
	public String getRestaurantname() {
		return restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Item> getList() {
		return itemList;
	}
	public void setList(List<Item> list) {
		this.itemList = list;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public Restaurant(String restaurantid, String restaurantname, Address address, List<Item> list,
			String managername, String contactnumber) {
		super();
		this.restaurantid = restaurantid;
		this.restaurantname = restaurantname;
		this.address = address;
		this.itemList = list;
		this.managername = managername;
		this.contactnumber = contactnumber;
	}
	

}
