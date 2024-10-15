package com.ecommerce.ecommerce_restapi.service;

import java.util.List;

import com.ecommerce.ecommerce_restapi.controller.ProductNotFound;
import com.ecommerce.ecommerce_restapi.exception.CartItemNotFound;
import com.ecommerce.ecommerce_restapi.models.Cart;
import com.ecommerce.ecommerce_restapi.models.CartDTO;
import com.ecommerce.ecommerce_restapi.models.CartItem;


public interface CartService {
	
	public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
	public Cart getCartProduct(String token);
	public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFound;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);
	
	public Cart clearCart(String token);
	
}