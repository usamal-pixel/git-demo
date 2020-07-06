package in.samal.orderservice.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import in.samal.orderservice.api.common.TransactionResponse;
import in.samal.orderservice.api.entity.Order;
import in.samal.orderservice.api.repository.OrderRepository;
import in.samal.orderservice.api.util.NotificationUtil;

@Service
public class OrderService {

	
	@Autowired
	private OrderRepository orderRepository;
	
	public TransactionResponse saveOrder(Order order){
		
		String message = NotificationUtil.sendEmail("utkal@gmail.com");
		Order ord =  orderRepository.save(order);
		return  new TransactionResponse(ord,message);
		
	}
	public List<Order> allOrders(){
		
		return orderRepository.findAll();
		
	}
}
