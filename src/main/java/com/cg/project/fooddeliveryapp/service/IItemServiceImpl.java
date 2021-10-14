package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.Category;
import com.cg.project.fooddeliveryapp.entity.Item;
import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.repository.CategoryRepository;
import com.cg.project.fooddeliveryapp.repository.ItemRepository;
import java.util.Optional;
@Service
public class IItemServiceImpl implements IItemService{

	@Autowired
	ItemRepository iItemRepository;
	@Autowired
	CategoryRepository categoryRepo;
	
	@Override
	public Item addItem(Item item) {
        Category category  = item.getCategory();
        if(null!=category && null!=category.getCategorytId()) {
        Optional<Category> catContainer = categoryRepo.findById(category.getCategorytId());
        if(catContainer.isPresent()) {
        	item.setCategory(catContainer.get());
        }
        }
		return iItemRepository.save(item);
	}

	@Override
	public Item updateItem(Item item) {
		iItemRepository.findById(item.getItemId()).orElseThrow(
				() -> new EntityNotFoundException("no Item found by the id"));

		return iItemRepository.saveAndFlush(item);
	}

	@Override
	public Item viewItem(String id) {
		return iItemRepository.findById(id)
				.orElseThrow( () -> new EntityNotFoundException("No Item found by the id"));
		
	}

	@Override
	public Item removeItem(String id) {
		Item item = iItemRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("No Items found"));
		iItemRepository.delete(item);
		return item;
		
	}

	@Override
	public List<Item> viewAllItems(String cat) {
		return iItemRepository.findByCategory(cat);
	}

	@Override
	public List<Item> viewAllItems() {
		return iItemRepository.findAll();
	}

	@Override
	public List<Item> viewAllItemsByName(String categoryName) {
		
		return iItemRepository.findByItemName(categoryName);	
	}

}
