package com.cg.project.fooddeliveryapp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

//import org.graalvm.compiler.core.common.type.ArithmeticOpTable.Op;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.Bill;
import com.cg.project.fooddeliveryapp.entity.Item;
import com.cg.project.fooddeliveryapp.repository.BillRepository;

@Service
public class IBillServiceImpl implements IBillService {

	@Autowired
	private BillRepository iBillRepository; 
	
	@Override
	public Bill addBill(Bill bill) {
		// TODO Auto-generated method stub
		return iBillRepository.save(bill);
	}

	@Override
	public Bill updateBill(Bill bill) {
		// TODO Auto-generated method stub
		Optional<Bill> optional = iBillRepository.findById(bill.getBillId());
		
		if(optional.isPresent())
		{
			iBillRepository.saveAndFlush(bill);
		}
		return bill;
		
	}	
	
	
	
	@Override
	public Bill removeBill(String id) {
		// TODO Auto-generated method stub
		Bill bill = iBillRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("No Items found"));
		iBillRepository.delete(bill);
		return bill;
	}

	@Override
	public Bill viewBills(String id) {
		Optional<Bill> b  = iBillRepository.findById(id);
		if(b.isPresent()) {
		return b.get();
		}
		return new Bill();
	}

	@Override
	public Bill calculateTotalCost(String id) {
		// TODO Auto-generated method stub
		Optional<Bill> billContainer = iBillRepository.findById(id);
		Bill currentBill = null;
		double totalCost = 0.0;
		if(billContainer.isPresent()) {
			currentBill = billContainer.get();
			List<Item> items = billContainer.get().getOrder().getCart().getItemlist();
			if(items.size()>0){
				for(Item item:items) {
					totalCost += item.getQuantity()*item.getCost();
				}
			}
		}
		currentBill.setTotalCost(totalCost);
		iBillRepository.save(currentBill);
		return currentBill;
		}

}

