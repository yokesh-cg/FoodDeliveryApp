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
	}
	
	public String getCategorytId() {
		return categorytId;
	}
	

	public void setCategorytId(String categorytId) {
		this.categorytId = categorytId;
	}

	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Category(String catid, String categoryname) {
		super();
		this.categorytId = catid;
		this.categoryName = categoryname;
	}
	

}
