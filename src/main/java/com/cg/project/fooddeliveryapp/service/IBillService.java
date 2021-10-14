package com.cg.project.fooddeliveryapp.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.project.fooddeliveryapp.entity.Bill;

public interface IBillService {
		public Bill addBill(Bill bill);
		public Bill updateBill(Bill bill);
		public Bill removeBill(String id);
		public Bill viewBills(String id);
		public Bill calculateTotalCost(String id);
			
}
