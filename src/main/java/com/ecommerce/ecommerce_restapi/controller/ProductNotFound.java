package com.ecommerce.ecommerce_restapi.controller;

public class ProductNotFound extends RuntimeException{
	public ProductNotFound() {
		
	}
	public ProductNotFound(String message) {
		super(message);
	}
}
