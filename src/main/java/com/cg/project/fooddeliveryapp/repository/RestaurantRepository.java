package com.cg.project.fooddeliveryapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.project.fooddeliveryapp.entity.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, String>{
	
	@Query(value="SELECT * FROM Restaurant r WHERE r.address_addressid in (SELECT addressid FROM address a where a.city = ?1)",nativeQuery = true)
	List<Restaurant> viewNearByRestaurant(String location);
	
	@Query(value="SELECT * FROM Restaurant r where r.restaurantid in (SELECT restaurant_id FROM item i where i.item_name= ?1)",nativeQuery = true)
	List<Restaurant> viewRestaurantByItemName(String name);
}
