package com.ecommerce.ecommerce_restapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
	
	private String prodName;
	private String manufaturer;
	private Double price;
	private Integer quantity;
	
	
}