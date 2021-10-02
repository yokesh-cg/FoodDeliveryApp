package com.cg.project.fooddeliveryapp.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.project.fooddeliveryapp.entity.Bill;

public interface IBillService {
		public Bill addBill(Bill bill);
		public Bill updateBill(Bill bill);
		public Bill removeBill(String id);
		public List<Bill> viewBills(LocalDate startDate, LocalDate endDate);
		public Bill viewBills(String custid);
		public double calculateTotalCost(Bill bill);
			
}
