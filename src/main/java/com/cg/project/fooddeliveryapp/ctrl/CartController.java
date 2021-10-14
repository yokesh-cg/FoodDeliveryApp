package com.cg.project.fooddeliveryapp.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.FoodCart;
import com.cg.project.fooddeliveryapp.entity.Item;
import com.cg.project.fooddeliveryapp.service.ICartService;

@RestController
@RequestMapping("/api")
public class CartController {
	
	@Autowired
	ICartService iCartService;
	
	@PostMapping("/foodcart")
	public FoodCart addItemToCart(@RequestBody FoodCart cart, Item item) {
		return iCartService.addItemToCart(cart, item);
	}
	
	@PostMapping("/incQtyFoodcart/{cartId}/{itemId}")
	public FoodCart increaseQuantity(@PathVariable String cartId, String itemId, int quantity) {
		return iCartService.increaseQuantity(cartId, itemId, quantity);
	}
	
	@PostMapping("/decQtyFoodcart/{cartId}/{itemId}")
	public FoodCart reduceQuantity(@PathVariable String cartId, String itemId, int quantity) {
		return iCartService.reduceQuantity(cartId, itemId, quantity);
	}
	
	@DeleteMapping("/foodcart/{cartId}/{itemId}")
	public FoodCart removeItem(@PathVariable String cartId, String itemId) {
		return iCartService.removeItem(cartId, itemId);
	}
	
}
