package com.cg.project.fooddeliveryapp.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Bill")
public class Bill {
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	String billId;
	@Temporal(value = TemporalType.DATE)
	Date billdate;
	
	@OneToOne(cascade=CascadeType.ALL)
	OrderDetails order;
	
	int totalItem;
	double totalCost;
	
	
	
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public Date getBilldate() {
		return billdate;
	}
	public void setBilldate(Date billdate) {
		this.billdate = billdate;
	}
	public OrderDetails getOrder() {
		return order;
	}
	public void setOrder(OrderDetails order) {
		this.order = order;
	}
	public int getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Bill(String billId, Date billdate, OrderDetails order, int totalItem, double totalCost) {
		super();
		this.billId = billId;
		this.billdate = billdate;
		this.order = order;
		this.totalItem = totalItem;
		this.totalCost = totalCost;
	}
	

}
