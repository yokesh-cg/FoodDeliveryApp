package com.cg.project.fooddeliveryapp.service;

import java.util.List;

import com.cg.project.fooddeliveryapp.entity.Restaurant;

public interface IRestaurantService {
	public Restaurant addRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Restaurant res);
	public Restaurant removeRestaurant(Restaurant res);
	public Restaurant viewRestaurant(Restaurant res);
	public List<Restaurant> viewBearByRestaurant(String location);
	public List<Restaurant> viewRestaurantByItemName(String name);
	

}
