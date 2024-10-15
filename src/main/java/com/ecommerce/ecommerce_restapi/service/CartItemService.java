package com.ecommerce.ecommerce_restapi.service;


import com.ecommerce.ecommerce_restapi.models.CartDTO;
import com.ecommerce.ecommerce_restapi.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}