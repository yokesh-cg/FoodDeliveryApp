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

import com.cg.project.fooddeliveryapp.entity.Category;
import com.cg.project.fooddeliveryapp.entity.Item;
import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.service.IItemService;



@RestController
@RequestMapping("/api")
public class IItemController {
	
	@Autowired
	IItemService iItemService;
	
	@PostMapping("/additem")
	public Item addItem(@RequestBody Item item) {
		return iItemService.addItem(item);
	}
	
	@PutMapping("/updateitem")
	public Item updateItem(@RequestBody Item item) {
		return iItemService.updateItem(item);
	}
	
	@GetMapping("/viewitem/{id}")
	public Item viewItem(@PathVariable String id) {
		return iItemService.viewItem(id);
	}
	
	@DeleteMapping("/removeitem/{id}")
	public void removeItem(@PathVariable String id) {
		iItemService.removeItem(id);
	}
	
	@GetMapping("/viewallitemsbycategory")
	public List<Item> viewAllItems(@RequestBody Category cat){
		return iItemService.viewAllItems(cat);
	}
	
	@GetMapping("/viewallitemsbyrestaurant")
	public List<Item> viewAllItems(@RequestBody Restaurant res){
		return iItemService.viewAllItems(res);
	}
	
	@GetMapping("/viewallitemsbyname/{name}")
	public List<Item> viewAllItemsByName(@RequestParam(value = "item_name") String name){
		return iItemService.viewAllItemsByName(name);
	}

}
