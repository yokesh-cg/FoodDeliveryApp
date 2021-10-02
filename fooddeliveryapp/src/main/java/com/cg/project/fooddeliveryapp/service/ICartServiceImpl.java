package com.cg.project.fooddeliveryapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.FoodCart;
import com.cg.project.fooddeliveryapp.entity.Item;
import com.cg.project.fooddeliveryapp.repository.ICartRepository;

@Service
public class ICartServiceImpl implements ICartService{

	@Autowired
	private ICartRepository iCartRepository;
	
	
	@Override
	public FoodCart addItemToCart(FoodCart cart, Item item) {
		// TODO Auto-generated method stub
		Optional<FoodCart> foodCart = iCartRepository.findById(cart.getCartid());
		FoodCart fc = foodCart.get();
		fc.getItemlist().add(item);	
		fc.getItemlist().forEach(System.out::println);
		return fc;
	}

	@Override
	public FoodCart increaseQuantity(FoodCart cart, Item item, int quantity) {
		// TODO Auto-generated method stub
		Optional<FoodCart> optional = iCartRepository.findById(cart.getCartid());
		FoodCart foodCart = optional.get();
		
		int i = foodCart.getItemlist().indexOf(item);
		Item item1 = foodCart.getItemlist().get(i);
		
		item1.setQuantity(item1.getQuantity()+quantity);
		return foodCart;
	}

	@Override
	public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity) {
		// TODO Auto-generated method stub
		Optional<FoodCart> optional = iCartRepository.findById(cart.getCartid());
		FoodCart foodCart = optional.get();
		
		int i = foodCart.getItemlist().indexOf(item);
		Item item1 = foodCart.getItemlist().get(i);
		
		item1.setQuantity(item1.getQuantity()-quantity);
		return foodCart;
	}

	@Override
	public FoodCart removeItem(FoodCart cart, Item item) {
		// TODO Auto-generated method stub
		Optional<FoodCart> optional = iCartRepository.findById(cart.getCartid());
		FoodCart foodCart = optional.get();
		foodCart.getItemlist().remove(item);
		return foodCart;
	}

	@Override
	public FoodCart clearCart(FoodCart cart) {
		// TODO Auto-generated method stub
		iCartRepository.deleteAll();
		return cart;
	}

}
