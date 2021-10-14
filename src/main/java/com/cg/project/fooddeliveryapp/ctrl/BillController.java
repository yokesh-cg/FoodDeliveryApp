package com.cg.project.fooddeliveryapp.ctrl;

import java.time.LocalDate;
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

import com.cg.project.fooddeliveryapp.entity.Bill;
import com.cg.project.fooddeliveryapp.service.IBillService;


@RestController
@RequestMapping("/api")
public class BillController {
	
	@Autowired
	IBillService iBillService;
	
	@PostMapping("/bill")
	public Bill addBill(@RequestBody Bill bill) {
		return iBillService.addBill(bill);		
	}
	
	@PutMapping("/bill")
	public Bill updateBill(@RequestBody Bill bill) {
		return iBillService.updateBill(bill);
	}
	
	@DeleteMapping("/bill/{id}")
	public Bill removeBill(@PathVariable String id) {
		return iBillService.removeBill(id);
	}
	
	@GetMapping("/bill/{id}")
	public Bill viewBills(@PathVariable String id){
		return iBillService.viewBills(id);
	}
	
	@GetMapping("/totalBill/{id}")
	public Bill calculateTotalCost(@PathVariable String id) {
		return iBillService.calculateTotalCost(id);
	}

}
