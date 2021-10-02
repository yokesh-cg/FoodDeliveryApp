package com.cg.project.fooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.Category;
import com.cg.project.fooddeliveryapp.repository.ICategoryRepository;

@Service
public class ICategoryServiceImpl implements ICategoryService {

	@Autowired
	private ICategoryRepository iCategoryRepository;

	@Override
	public Category addCategory(Category cat) {
		// TODO Auto-generated method stub
		return iCategoryRepository.save(cat);
	}

	@Override
	public Category updateCategory(Category cat) {
		// TODO Auto-generated method stub
		return iCategoryRepository.save(cat);
	}

	@Override
	public Category removeCategory(Category cat) {
		// TODO Auto-generated method stub
		iCategoryRepository.delete(cat);
		return cat;
	}

	
	//exception not declared 
	@Override
	public Category viewCategory(String id) {
		// TODO Auto-generated method stub
		Optional <Category> optional =  iCategoryRepository.findById(id);
		Category category = null;
		if(optional.isPresent())
		{
			category = optional.get();
		}
		else
		{
			throw new RuntimeException(" Category not found for id :: " + id);
		}
		
		return category;
	}
	
	
	@Override
	public List<Category> viewAllCategory() {
		// TODO Auto-generated method stub
		return iCategoryRepository.findAll();
	}

}
