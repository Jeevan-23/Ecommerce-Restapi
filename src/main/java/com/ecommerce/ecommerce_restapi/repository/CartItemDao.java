package com.ecommerce.ecommerce_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce_restapi.models.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}