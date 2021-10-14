package com.cg.project.fooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.Category;
import com.cg.project.fooddeliveryapp.repository.CategoryRepository;

@Service
public class ICategoryServiceImpl implements ICategoryService {

	@Autowired
	private CategoryRepository iCategoryRepository;

	@Override
	public Category addCategory(Category cat) {
		return iCategoryRepository.save(cat);
	}

	@Override
	public Category updateCategory(Category cat) {
		iCategoryRepository.findById(cat.getCategorytId())
				.orElseThrow(() -> new EntityNotFoundException("No Category found"));
		return iCategoryRepository.saveAndFlush(cat);
	}

	@Override
	public Category removeCategory(String catId) {

		Category cat = iCategoryRepository.findById(catId).orElseThrow(() -> new EntityNotFoundException("No Category found"));
		iCategoryRepository.delete(cat);
		return cat;
	}

	@Override
	public Category viewCategory(String id) {
		// TODO Auto-generated method stub
		return iCategoryRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("No Category found"));
		
	}

	@Override
	public List<Category> viewAllCategory() {
		// TODO Auto-generated method stub
		return iCategoryRepository.findAll();
	}

}
