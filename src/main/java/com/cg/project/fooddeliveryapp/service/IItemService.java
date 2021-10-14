package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import com.cg.project.fooddeliveryapp.entity.Category;
import com.cg.project.fooddeliveryapp.entity.Item;
import com.cg.project.fooddeliveryapp.entity.Restaurant;

public interface IItemService {
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item removeItem(String id);
	public Item viewItem(String id);
	public List<Item> viewAllItems(String catId);
	public List<Item> viewAllItems();
	public List<Item> viewAllItemsByName(String name);
	

}
