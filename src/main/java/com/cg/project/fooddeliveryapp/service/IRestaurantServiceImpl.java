package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.repository.RestaurantRepository;

@Service
public class IRestaurantServiceImpl implements IRestaurantService {
	@Autowired
	RestaurantRepository restaurantRepository;

	@Override
	public Restaurant addRestaurant(Restaurant res) {

		return restaurantRepository.save(res);

	}

	@Override
	public Restaurant updateRestaurant(Restaurant res) {
		restaurantRepository.findById(res.getRestaurantid()).orElseThrow(
				() -> new EntityNotFoundException("no Restaurants found by the id" + res.getRestaurantid() ));
		return restaurantRepository.saveAndFlush(res);
	}

	@Override
	public Restaurant removeRestaurant(String id) {
		Restaurant restaurant = restaurantRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("No Restaurants found"));
		restaurantRepository.delete(restaurant);
		return restaurant;
	}

	@Override
	public Restaurant viewRestaurant(String id) {
		return restaurantRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("No Restaurants found"));
	}

	@Override
	public List<Restaurant> viewNearByRestaurant(String location) {
		return restaurantRepository.viewNearByRestaurant(location);
	}

	@Override
	public List<Restaurant> viewRestaurantByItemName(String name) {
		return restaurantRepository.viewRestaurantByItemName(name);
	}

}
