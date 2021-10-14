package com.cg.project.fooddeliveryapp.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="OrderDetails")
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int orderid;
	
	@Temporal(value = TemporalType.DATE)
	Date orderdate;
	
	@OneToOne(cascade=CascadeType.MERGE)
	FoodCart cart;
	
	String orderstatus;
	
	
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public OrderDetails(int orderid, Date orderdate, FoodCart cart, String orderstatus) {
		super();
		this.orderid = orderid;
		this.orderdate = orderdate;
		this.cart = cart;
		this.orderstatus = orderstatus;
	}
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public FoodCart getCart() {
		return cart;
	}
	public void setCart(FoodCart cart) {
		this.cart = cart;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	

}
