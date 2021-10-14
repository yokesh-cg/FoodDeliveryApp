package com.cg.project.fooddeliveryapp.service;

import com.cg.project.fooddeliveryapp.entity.FoodCart;
import com.cg.project.fooddeliveryapp.entity.Item;

public interface ICartService {
	public FoodCart addItemToCart(FoodCart cart, Item item);
	public FoodCart increaseQuantity(String cartId, String itemId, int quantity);
	public FoodCart reduceQuantity(String cartId, String itemId, int quantity);
	public FoodCart removeItem(String cartId, String itemId);

}
