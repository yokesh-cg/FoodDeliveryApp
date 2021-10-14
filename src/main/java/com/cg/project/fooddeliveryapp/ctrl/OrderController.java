package com.cg.project.fooddeliveryapp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.Customer;
import com.cg.project.fooddeliveryapp.entity.OrderDetails;
import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.service.IOrderService;



@RestController
@RequestMapping("/api")
public class OrderController {
	
	@Autowired
	IOrderService iOrderService;
	
	@PostMapping("/order")
	public OrderDetails addOrder(@RequestBody OrderDetails order) {
		return iOrderService.addOrder(order);
	}
	
	@PutMapping("/order")
	public OrderDetails updateOrder(@RequestBody OrderDetails order) {
		return iOrderService.updateOrder(order);
	}
	
	@DeleteMapping("/order/{id}")
	public OrderDetails removeOrder(@PathVariable int id) {
		return iOrderService.removeOrder(id);
	}
	
	@GetMapping("/order/{id}")
	public OrderDetails viewOrder(@PathVariable int id) {
		return iOrderService.viewOrder(id);
	}
	
	@GetMapping("/order")
	public List<OrderDetails> viewAllOrders(){
		return iOrderService.viewAllOrders();
		
	}

}
