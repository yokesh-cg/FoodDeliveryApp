package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.Category;
import com.cg.project.fooddeliveryapp.entity.Item;
import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.repository.IItemRepository;

@Service
public class IItemServiceImpl implements IItemService{

	@Autowired
	IItemRepository iItemRepository;
	
	@Override
	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		return iItemRepository.save(item);
	}

	@Override
	public Item updateItem(Item item) {
		// TODO Auto-generated method stub
		Item item1 = iItemRepository.findById(item.getItemId()).orElseThrow(
				() -> new EntityNotFoundException("no Item found by the id"));
		item1.setCategory(item.getCategory());
		item1.setCost(item.getCost());
		item1.setItemName(item.getItemName());
		item1.setQuantity(item.getQuantity());
		return iItemRepository.save(item1);
	}

	@Override
	public Item viewItem(String id) {
		// TODO Auto-generated method stub
		Item item1 = iItemRepository.findById(id).orElseThrow( () -> new EntityNotFoundException("No Item found by the id"));
		return item1;
	}

	@Override
	public void removeItem(String id) {
		// TODO Auto-generated method stub
		Item item = iItemRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("No Items found"));
		iItemRepository.delete(item);
		
	}

	@Override
	public List<Item> viewAllItems(Category cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> viewAllItems(Restaurant res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> viewAllItemsByName(String name) {
		// TODO Auto-generated method stub
		return iItemRepository.findByItemName(name);	
	}

}
