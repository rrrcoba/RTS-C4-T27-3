package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICashRegisterDAO;
import com.example.demo.dto.CashRegister;

@Service
public class CashRegisterServiceImpl implements ICashRegisterService{

	@Autowired
	ICashRegisterDAO iCashRegisterDAO;

	@Override
	public List<CashRegister> listCashRegisters() {
		
		return iCashRegisterDAO.findAll();
	}

	@Override
	public CashRegister saveCashRegister(CashRegister cr) {
		
		return iCashRegisterDAO.save(cr);
	}

	@Override
	public CashRegister cashRegisterById(Long id) {
		
		return iCashRegisterDAO.findById(id).get();
	}

	@Override
	public CashRegister updateCashRegister(CashRegister cr) {
		
		return iCashRegisterDAO.save(cr);
	}

	@Override
	public void deleteCashRegister(Long id) {
		iCashRegisterDAO.deleteById(id);
	}

	
}
