package com.ecommerce.ecommerce_restapi.exception;

public class SellerNotFoundException extends RuntimeException{
	
	public SellerNotFoundException() {
		super();
	}
	
	
	public SellerNotFoundException(String message) {
		super(message);
	}
}
