package com.cg.project.fooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.FoodCart;
import com.cg.project.fooddeliveryapp.entity.Item;
import com.cg.project.fooddeliveryapp.repository.CartRepository;
import com.cg.project.fooddeliveryapp.repository.ItemRepository;
import com.cg.project.fooddeliveryapp.repository.OrderRepository;

@Service
public class ICartServiceImpl implements ICartService{

	@Autowired
	private CartRepository iCartRepository;
	@Autowired
	private ItemRepository iItemRepository;
	@Autowired
	private OrderRepository iOrderRepo;
	
	
	@Override
	public FoodCart addItemToCart(FoodCart cart, Item item) {
		// TODO Auto-generated method stub
		Optional<FoodCart> foodCart = iCartRepository.findById(cart.getCartid());
		FoodCart fc = foodCart.get();
		List<Item> l = fc.getItemlist();
		l.add(item);
		fc.setItemlist(l);
		fc.getItemlist().forEach(System.out::println);
		return iCartRepository.save(fc);
	}

	@Override
	public FoodCart increaseQuantity(String cartId, String itemId, int quantity) {
		// TODO Auto-generated method stub
		FoodCart foodCart = iCartRepository.findById(cartId).get();
		Item item = iItemRepository.findById(itemId).get();
		int i = foodCart.getItemlist().indexOf(item);
		Item item1 = foodCart.getItemlist().get(i);
		
		item1.setQuantity(item1.getQuantity() + quantity);
		return iCartRepository.save(foodCart);
	}

	@Override
	public FoodCart reduceQuantity(String cartId, String itemId, int quantity) {
		// TODO Auto-generated method stub
		FoodCart foodCart = iCartRepository.findById(cartId).get();
		Item item = iItemRepository.findById(itemId).get();
		int i = foodCart.getItemlist().indexOf(item);
		Item item1 = foodCart.getItemlist().get(i);
		
		item1.setQuantity(item1.getQuantity() - quantity);
		return iCartRepository.save(foodCart);
	}

	
	@Override
	public FoodCart removeItem(String cartId, String itemId) {
		// TODO Auto-generated method stub
		Optional<FoodCart> foodCartOp = iCartRepository.findById(cartId);
		Optional<Item> ItemOp = iItemRepository.findById(itemId);
		System.out.println(itemId);
		FoodCart foodCart = foodCartOp.get();
		Item item = ItemOp.get();
		System.out.println(foodCart.getItemlist());
		foodCart.getItemlist().remove(foodCart.getItemlist().indexOf(item));
		
		foodCart.setItemlist(foodCart.getItemlist());
		
		return iCartRepository.save(foodCart);
	}

	

}
