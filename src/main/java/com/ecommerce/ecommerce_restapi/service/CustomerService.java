package com.ecommerce.ecommerce_restapi.service;

import java.util.List;

import com.ecommerce.ecommerce_restapi.exception.CustomerException;
import com.ecommerce.ecommerce_restapi.exception.CustomerNotFoundException;
import com.ecommerce.ecommerce_restapi.models.Address;
import com.ecommerce.ecommerce_restapi.models.CreditCard;
import com.ecommerce.ecommerce_restapi.models.Customer;
import com.ecommerce.ecommerce_restapi.models.CustomerDTO;
import com.ecommerce.ecommerce_restapi.models.CustomerUpdateDTO;
import com.ecommerce.ecommerce_restapi.models.Order;
import com.ecommerce.ecommerce_restapi.models.SessionDTO;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer) throws CustomerException;
	
	public Customer getLoggedInCustomerDetails(String token) throws CustomerNotFoundException;
	
	public List<Customer> getAllCustomers(String token) throws CustomerNotFoundException;
	
	public Customer updateCustomer(CustomerUpdateDTO customer, String token) throws CustomerNotFoundException;
	
	public Customer updateCustomerMobileNoOrEmailId(CustomerUpdateDTO customerUpdateDTO, String token) throws CustomerNotFoundException;
	
	public Customer updateCreditCardDetails(String token, CreditCard card) throws CustomerException;
	
	public SessionDTO updateCustomerPassword(CustomerDTO customerDTO, String token) throws CustomerNotFoundException;
	
	public SessionDTO deleteCustomer(CustomerDTO customerDTO, String token) throws CustomerNotFoundException;
	
	public Customer updateAddress(Address address, String type, String token) throws CustomerException;
	
	public Customer deleteAddress(String type, String token) throws CustomerException, CustomerNotFoundException;

	public List<Order> getCustomerOrders(String token) throws CustomerException; 

}