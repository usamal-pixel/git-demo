package in.samal.orderservice.api;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import in.samal.orderservice.api.entity.Order;
import in.samal.orderservice.api.repository.OrderRepository;
import in.samal.orderservice.api.service.OrderService;
import in.samal.orderservice.api.util.NotificationUtil;



@ExtendWith(SpringExtension.class)

@SpringBootTest
class OrderServiceApplicationTests {

	@Autowired
	OrderService orderService;
	@MockBean
	OrderRepository orderRepository;
	

	
	
	
	
	@Test
	public void getInfo() {
		
		
		Mockito.when(orderRepository.findAll()).thenReturn(Stream.
				of(new Order(1,"paint",2,23.56), new Order(2,"paint-1",2,23.56)).collect(Collectors.toList()));
	
		assertEquals(2, orderService.allOrders().size());		
		
	}
	
	
	
}
