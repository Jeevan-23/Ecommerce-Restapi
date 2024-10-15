package com.ecommerce.ecommerce_restapi.models;

import jakarta.validation.constraints.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartDTO {
	
	@NotNull
	private Integer productId;
	
	private String productName;
	
	private Double price;
	
	@Min(1)
	private Integer quantity;
}