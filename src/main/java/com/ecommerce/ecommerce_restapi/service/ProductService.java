package com.ecommerce.ecommerce_restapi.service;

import java.util.List;

import com.ecommerce.ecommerce_restapi.models.CategoryEnum;
import com.ecommerce.ecommerce_restapi.models.Product;
import com.ecommerce.ecommerce_restapi.models.ProductDTO;
import com.ecommerce.ecommerce_restapi.models.ProductStatus;

public interface ProductService {

	public Product addProductToCatalog(String token, Product product);

	public Product getProductFromCatalogById(Integer id);

	public String deleteProductFromCatalog(Integer id);

	public Product updateProductIncatalog(Product product);
	
	public List<Product> getAllProductsIncatalog();
	
	public List<ProductDTO> getAllProductsOfSeller(Integer id);
	
	public List<ProductDTO> getProductsOfCategory(CategoryEnum catenum);
	
	public List<ProductDTO> getProductsOfStatus(ProductStatus status);
	
	
	
	public Product updateProductQuantityWithId(Integer id,ProductDTO prodDTO);

}