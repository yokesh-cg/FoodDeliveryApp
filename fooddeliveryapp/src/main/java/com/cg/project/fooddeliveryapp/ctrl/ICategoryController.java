package com.cg.project.fooddeliveryapp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.Category;
import com.cg.project.fooddeliveryapp.service.ICategoryService;

@RestController
@RequestMapping("/api/fooddelivery")
public class ICategoryController {
	
	@Autowired
	ICategoryService iCategoryService;
	
	@PostMapping("/addcategory")
	public Category addCategory(@RequestBody Category cat) {
		return iCategoryService.addCategory(cat);
	}
	
	@PostMapping("/updatecategory")
	public Category updateCategory(@RequestBody Category cat) {
		return iCategoryService.updateCategory(cat);
	}
	
	@DeleteMapping("/removecategory")
	public Category removeCategory(@RequestBody Category cat) {
		return iCategoryService.removeCategory(cat);
	}
	
	@GetMapping("/viewcategory")
	public Category viewCategory(@RequestBody Category cat) {
		return null;
	}
	
	@GetMapping("/viewallcategory")
	public List<Category> viewAllCategory(){
		return iCategoryService.viewAllCategory();
	}

}
