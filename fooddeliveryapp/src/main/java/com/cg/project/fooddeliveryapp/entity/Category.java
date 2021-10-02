package com.cg.project.fooddeliveryapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Category")
public class Category {
	
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String categorytId;
	
	private String categoryName;
	
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCatId() {
		return categorytId;
	}
	public void setCatId(String catid) {
		this.categorytId = catid;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryname(String categoryname) {
		this.categoryName = categoryname;
	}
	public Category(String catid, String categoryname) {
		super();
		this.categorytId = catid;
		this.categoryName = categoryname;
	}
	

}
