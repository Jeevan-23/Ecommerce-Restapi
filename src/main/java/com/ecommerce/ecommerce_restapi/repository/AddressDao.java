package com.ecommerce.ecommerce_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommerce_restapi.models.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{

}