package com.ecommerce.ecommerce_restapi.service;

import com.ecommerce.ecommerce_restapi.models.CustomerDTO;
import com.ecommerce.ecommerce_restapi.models.SellerDTO;
import com.ecommerce.ecommerce_restapi.models.SessionDTO;
import com.ecommerce.ecommerce_restapi.models.UserSession;


public interface LoginLogoutService {
	
	public UserSession loginCustomer(CustomerDTO customer);
	
	public SessionDTO logoutCustomer(SessionDTO session);
	
	public void checkTokenStatus(String token);
	
	public void deleteExpiredTokens();
	
	
	public UserSession loginSeller(SellerDTO seller);
	
	public SessionDTO logoutSeller(SessionDTO session);
	
	
}