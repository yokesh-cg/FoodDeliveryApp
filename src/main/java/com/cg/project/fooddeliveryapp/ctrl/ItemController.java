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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.Item;
import com.cg.project.fooddeliveryapp.service.IItemService;



@RestController
@RequestMapping("/api")
public class ItemController {
	
	@Autowired
	IItemService iItemService;
	@PostMapping("/items")
	public Item addItem(@RequestBody Item item) {
		return iItemService.addItem(item);
	}
	
	@PutMapping("/items")
	public Item updateItem(@RequestBody Item item) {
		return iItemService.updateItem(item);
	}
	
	@GetMapping("/items/{id}")
	public Item viewItem(@PathVariable String id) {
		return iItemService.viewItem(id);
	}
	
	@DeleteMapping("/items/{id}")
	public Item removeItem(@PathVariable String id) {
		return iItemService.removeItem(id);
	}
	
	@GetMapping("/items/category/{categoryId}")
	public List<Item> viewAllItemsByCategory(@PathVariable String categoryId){
		return iItemService.viewAllItems(categoryId);
	}
	
	@GetMapping("/items")
	public List<Item> viewAllItems(){
		return iItemService.viewAllItems();
	}
	
	@GetMapping("/items/categories/{name}")
	public List<Item> viewAllItemsByName(@PathVariable  String name){
		
		return iItemService.viewAllItemsByName(name);
	}

}
