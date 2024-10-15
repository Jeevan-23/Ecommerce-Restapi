package com.ecommerce.ecommerce_restapi.service;

import java.time.LocalDate;
import java.util.List;

import com.ecommerce.ecommerce_restapi.exception.CustomerNotFoundException;
import com.ecommerce.ecommerce_restapi.exception.LoginException;
import com.ecommerce.ecommerce_restapi.exception.OrderException;
import com.ecommerce.ecommerce_restapi.models.Customer;
import com.ecommerce.ecommerce_restapi.models.Order;
import com.ecommerce.ecommerce_restapi.models.OrderDTO;

public interface OrderService {
	public Order saveOrder(OrderDTO odto,String token) throws LoginException, OrderException;
	
	public Order getOrderByOrderId(Integer OrderId) throws OrderException;
	
	public List<Order> getAllOrders() throws OrderException;
	
	public Order cancelOrderByOrderId(Integer OrderId,String token) throws OrderException;
	
	public Order updateOrderByOrder(OrderDTO order,Integer OrderId,String token) throws OrderException,LoginException;
	
	public List<Order> getAllOrdersByDate(LocalDate date) throws OrderException;

	public Customer getCustomerByOrderid(Integer orderId) throws OrderException;
	
	//public Customer getCustomerIdByToken(String token) throws CustomerNotFoundException;
	

	
}