package com.cg.project.fooddeliveryapp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.Category;
import com.cg.project.fooddeliveryapp.service.ICategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {
	
	@Autowired
	ICategoryService iCategoryService;
	
	@PostMapping("/categories")
	public Category addCategory(@RequestBody Category cat) {
		return iCategoryService.addCategory(cat);
	}
	
	@PutMapping("/categories")
	public Category updateCategory(@RequestBody Category cat) {
		return iCategoryService.updateCategory(cat);
	}
	
	@DeleteMapping("/categories/{categoryId}")
	public Category removeCategory(@PathVariable String categoryId) {
		return iCategoryService.removeCategory(categoryId);
	}
	
	@GetMapping("/categories/{categoryId}")
	public Category viewCategory(@PathVariable String categoryId) {
		return iCategoryService.viewCategory(categoryId);
	}
	
	@GetMapping("/categories")
	public List<Category> viewAllCategory(){
		return iCategoryService.viewAllCategory();
	}

}
