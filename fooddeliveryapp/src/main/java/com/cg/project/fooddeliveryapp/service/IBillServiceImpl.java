package com.cg.project.fooddeliveryapp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.Op;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.Bill;
import com.cg.project.fooddeliveryapp.repository.IBillRepository;

@Service
public class IBillServiceImpl implements IBillService {

	@Autowired
	private IBillRepository iBillRepository; 
	
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
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Bill viewBills(String custid) {
		// TODO Auto-generated method stub
		Optional<Bill> b  = iBillRepository.findById(custid);
		return b.get();
		
	}

	@Override
	public double calculateTotalCost(Bill bill) {
		// TODO Auto-generated method stub
		return 0;
	}

}

