package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import com.cg.project.fooddeliveryapp.entity.Category;


public interface ICategoryService {
	public Category addCategory(Category cat);
	public Category updateCategory(Category cat);
	public Category removeCategory(String categoryId);
	public Category viewCategory(String id);
	public List<Category> viewAllCategory();

	

}
