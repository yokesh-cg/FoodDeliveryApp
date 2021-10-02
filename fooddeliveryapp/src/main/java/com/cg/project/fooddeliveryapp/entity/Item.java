package com.cg.project.fooddeliveryapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;



@Entity(name="Item")
public class Item {
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String itemId;
	private String itemName;
	private int quantity;
	private double cost;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="category_id")
	private Category category;
	
	
	@ManyToMany(mappedBy = "itemList")
	private List<Restaurant> restaurants;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String itemId, String itemName, Category category, int quantity, double cost,
			List<Restaurant> restaurants) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
		this.quantity = quantity;
		this.cost = cost;
		this.restaurants = restaurants;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	
	
}
	 