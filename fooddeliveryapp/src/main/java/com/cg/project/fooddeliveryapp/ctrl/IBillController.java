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
public class IBillController {
	
	@Autowired
	IBillService iBillService;
	
	@PostMapping("/bills")
	public Bill addBill(@RequestBody Bill bill) {
		return iBillService.addBill(bill);		
	}
	
	@PutMapping("/bills")
	public Bill updateBill(@RequestBody Bill bill) {
		return iBillService.updateBill(bill);
	}
	
	@DeleteMapping("/bills/{id}")
	public Bill removeBill(@PathVariable String id) {
		return iBillService.removeBill(id);
	}
	

	
	@GetMapping("/viewbillsbydate")
	public List<Bill> viewBills(@PathVariable LocalDate startDate, LocalDate endDate){		
		return null;
	}
	
	@GetMapping("/viewbillsbycustid")
	public Bill viewBills(@PathVariable String custid){
		return iBillService.viewBills(custid);
	}
	
	@GetMapping("/calculatebill")
	public double calculateTotalCost(@RequestBody Bill bill) {
		return iBillService.calculateTotalCost(bill);
	}

}
