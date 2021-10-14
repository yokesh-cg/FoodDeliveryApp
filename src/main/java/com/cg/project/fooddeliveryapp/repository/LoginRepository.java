package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.project.fooddeliveryapp.entity.Login;


public interface LoginRepository extends JpaRepository<Login, String>{
	
	@Query(value="SELECT * FROM login l WHERE l.user_name=?1 and l.password=?2",nativeQuery=true)
	Login signIn(String userName, String password);
	
}