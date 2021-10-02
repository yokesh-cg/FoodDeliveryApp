package com.cg.project.fooddeliveryapp.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.FoodCart;
import com.cg.project.fooddeliveryapp.entity.Item;
import com.cg.project.fooddeliveryapp.service.ICartService;

@RestController
@RequestMapping("/api/fooddelivery")
public class ICartController {
	
	@Autowired
	ICartService iCartService;
	
	@PostMapping("/addcartitem")
	public FoodCart addItemToCart(@RequestBody FoodCart cart, Item item) {
		return iCartService.addItemToCart(cart, item);
	}
	
	@PostMapping("/increaseqty")
	public FoodCart increaseQuantity(@RequestBody FoodCart cart, Item item, int quantity) {
		return iCartService.increaseQuantity(cart, item, quantity);
	}
	
	@PostMapping("/reduceqty")
	public FoodCart reduceQuantity(@RequestBody FoodCart cart, Item item,int quantity) {
		return iCartService.reduceQuantity(cart, item, quantity);
	}
	
	@DeleteMapping("/removecartitem")
	public FoodCart removeItem(@RequestBody FoodCart cart, Item item) {
		return iCartService.removeItem(cart, item);
	}
	
	@DeleteMapping("/clearcart")
	public FoodCart clearCart(@RequestBody FoodCart cart) {
		return iCartService.clearCart(cart);
	}
}
