package com.cg.project.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.project.fooddeliveryapp.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,String> {

}
