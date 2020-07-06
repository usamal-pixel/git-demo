package in.samal.orderservice.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.samal.orderservice.api.common.TransactionResponse;
import in.samal.orderservice.api.entity.Order;
import in.samal.orderservice.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody Order order){
		
		return orderService.saveOrder(order);
	}
	
	@GetMapping("/getOrders")
	public List<Order> allOrders(){
		
		return orderService.allOrders();
	}
}

 
