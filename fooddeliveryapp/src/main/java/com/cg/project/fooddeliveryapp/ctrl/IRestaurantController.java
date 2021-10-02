package com.cg.project.fooddeliveryapp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.service.IRestaurantService;



@RestController
@RequestMapping("/api/fooddelivery")
public class IRestaurantController {
	
	@Autowired
	IRestaurantService iRestaurantService;
	
	@PostMapping("/addrestaurant")
	public Restaurant addRestaurant(@RequestBody Restaurant res) {
		return iRestaurantService.addRestaurant(res);
	}
	
	@PostMapping("/updaterestaurant")
	public Restaurant updateRestaurant(@RequestBody Restaurant res) {
		return iRestaurantService.updateRestaurant(res);
	}
	
	@DeleteMapping("/removerestaurant")
	public Restaurant removeRestaurant(@RequestBody Restaurant res) {
		return iRestaurantService.removeRestaurant(res);
	}
	
	@GetMapping("/viewrestaurant")
	public Restaurant viewRestaurant(@RequestBody Restaurant res) {
		return iRestaurantService.viewRestaurant(res);
	}
	
	@GetMapping("/viewbearbyrestaurant")
	public List<Restaurant> viewBearByRestaurant(@PathVariable String location){
		return iRestaurantService.viewBearByRestaurant(location);
	}
	
	@GetMapping("/viewrestaurantbyitemname")
	public List<Restaurant> viewRestaurantByItemName(@PathVariable String name){
		return iRestaurantService.viewRestaurantByItemName(name);
	}
}
