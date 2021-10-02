package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.fooddeliveryapp.entity.Login;


public interface ILoginRepository extends JpaRepository<Login, String>{
	
}