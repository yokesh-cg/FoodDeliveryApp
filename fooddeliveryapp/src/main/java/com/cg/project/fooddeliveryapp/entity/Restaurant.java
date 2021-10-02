package com.cg.project.fooddeliveryapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			  name = "Restaurant_Items", 
			  joinColumns = @JoinColumn(name = "restaurant_id"), 
			  inverseJoinColumns = @JoinColumn(name = "item_id"))  // This is also optional, JPA generates joincolumns automatically if not configured
	List<Item> itemList;
	
	
	String managername;
	String contactnumber;
	
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
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
