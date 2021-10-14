package com.cg.project.fooddeliveryapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.project.fooddeliveryapp.entity.Item;



public interface ItemRepository extends JpaRepository<Item, String>{
	
	
	@Query(value="SELECT * FROM item u WHERE u.category_id = (select categoryt_id from Category  where category_name=?1) ",nativeQuery = true)
	List<Item> findByItemName(String name);
	@Query(value="SELECT * FROM item u WHERE u.category_id = ?1",nativeQuery = true)
	List<Item> findByCategory(String cat);
	
}