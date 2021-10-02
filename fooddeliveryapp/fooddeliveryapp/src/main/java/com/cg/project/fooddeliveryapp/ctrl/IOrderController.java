package com.cg.project.fooddeliveryapp.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.fooddeliveryapp.entity.Customer;
import com.cg.project.fooddeliveryapp.entity.OrderDetails;
import com.cg.project.fooddeliveryapp.entity.Restaurant;
import com.cg.project.fooddeliveryapp.service.IOrderService;



@RestController
@RequestMapping("/api")
public class IOrderController {
	
	@Autowired
	IOrderService iOrderService;
	
	@PostMapping("/addorder")
	public OrderDetails addOrder(@RequestBody OrderDetails order) {
		return iOrderService.addOrder(order);
	}
	
	@PostMapping("/updateorder")
	public OrderDetails updateOrder(@RequestBody OrderDetails order) {
		return iOrderService.updateOrder(order);
	}
	
	@DeleteMapping("/removeorder")
	public OrderDetails removeOrder(@RequestBody OrderDetails order) {
		return iOrderService.removeOrder(order);
	}
	
	@GetMapping("/vieworder")
	public OrderDetails viewOrder(@RequestBody OrderDetails order) {
		return iOrderService.viewOrder(order);
	}
	
	@GetMapping("/viewallordersbyrestaurant")
	public List<OrderDetails> viewAllOrders(@RequestBody Restaurant res){
		return iOrderService.viewAllOrders(res);
	}
	
	@GetMapping("/viewallordersbycustomer")
	public List<OrderDetails> viewAllOrders(@RequestBody Customer customer){
		return iOrderService.viewAllOrders(customer);
		
	}

}
