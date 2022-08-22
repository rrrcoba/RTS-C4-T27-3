package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICashierDAO;
import com.example.demo.dto.Cashier;

@Service
public class CashierServiceImpl implements ICashierService{

	@Autowired
	ICashierDAO iCashierDAO;
	
	@Override
	public List<Cashier> listAllCashiers() {
		
		return iCashierDAO.findAll();
	}

	@Override
	public Cashier saveCashier(Cashier c) {
		
		return iCashierDAO.save(c);
	}

	@Override
	public Cashier cashierById(Long id) {
		
		return iCashierDAO.findById(id).get();
	}

	@Override
	public Cashier updateCashier(Cashier c) {
		
		return iCashierDAO.save(c);
	}

	@Override
	public void deleteCashier(Long id) {
		iCashierDAO.deleteById(id);
	}

}
