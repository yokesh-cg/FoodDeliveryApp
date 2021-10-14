package com.cg.project.fooddeliveryapp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.service.IRestaurantService;



@RestController
@RequestMapping("/api")
public class RestaurantController {
	
	@Autowired
	IRestaurantService iRestaurantService;
	
	@PostMapping("/restaurant")
	public Restaurant addRestaurant(@RequestBody Restaurant res) {
		return iRestaurantService.addRestaurant(res);
	}
	
	@PutMapping("/restaurant")
	public Restaurant updateRestaurant(@RequestBody Restaurant res) {
		return iRestaurantService.updateRestaurant(res);
	}
	
	@DeleteMapping("/restaurant/{id}")
	public Restaurant removeRestaurant(@PathVariable String id) {
		return iRestaurantService.removeRestaurant(id);
	}
	
	@GetMapping("/restaurantById/{id}")
	public Restaurant viewRestaurant(@PathVariable String id) {
		return iRestaurantService.viewRestaurant(id);
	}
	
	@GetMapping("/restaurantByLocation/{location}")
	public List<Restaurant> viewNearByRestaurant(@PathVariable String location){
		return iRestaurantService.viewNearByRestaurant(location);
	}
	
	@GetMapping("/restaurantByItemName/{name}")
	public List<Restaurant> viewRestaurantByItemName(@PathVariable String name){
		return iRestaurantService.viewRestaurantByItemName(name);
	}
}
