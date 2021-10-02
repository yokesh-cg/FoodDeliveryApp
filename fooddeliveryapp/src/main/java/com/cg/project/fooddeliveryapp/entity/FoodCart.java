package com.cg.project.fooddeliveryapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="FoodCart")
public class FoodCart {
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String cartid;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cart_id")
	private List<Item> Itemlist;
	
	
	public FoodCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FoodCart(String cartid, Customer customer) {
		super();
		this.cartid = cartid;
		this.customer = customer;
	}
	
	public String getCartid() {
		return cartid;
	}
	public void setCartid(String cartid) {
		this.cartid = cartid;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Item> getItemlist() {
		return Itemlist;
	}
	public void setItemlist(List<Item> itemlist) {
		Itemlist = itemlist;
	}

	 
}
