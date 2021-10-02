package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import com.cg.project.fooddeliveryapp.entity.Category;
import com.cg.project.fooddeliveryapp.entity.Item;
import com.cg.project.fooddeliveryapp.entity.Restaurant;

public interface IItemService {
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public void removeItem(String id);
	public Item viewItem(String id);
	public List<Item> viewAllItems(Category cat);
	public List<Item> viewAllItems(Restaurant res);
	public List<Item> viewAllItemsByName(String name);
	

}
