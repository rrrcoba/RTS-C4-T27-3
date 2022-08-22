package com.example.demo.controller;

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

import com.example.demo.dto.CashRegister;
import com.example.demo.service.CashRegisterServiceImpl;

@RestController
@RequestMapping("/api")
public class CashRegisterController {

	@Autowired
	CashRegisterServiceImpl cashRegisterServiceImpl;
	
	@GetMapping("/cashregisters")
	public List<CashRegister> getAllCashRegister() {
		return cashRegisterServiceImpl.listCashRegisters();
	}
	
	@PostMapping("/cashregisters")
	public CashRegister saveCashRegister(@RequestBody CashRegister cr) {
		return cashRegisterServiceImpl.saveCashRegister(cr);
	}
	
	@GetMapping("/cashregisters/{id}")
	public CashRegister getCashRegisterById(@PathVariable(name="id") Long id) {
		return cashRegisterServiceImpl.cashRegisterById(id);
	}
	
	@PutMapping("/cashregisters/{id}")
	public CashRegister updateCashRegister(@PathVariable(name="id") Long id, @RequestBody CashRegister cr) {
		CashRegister selectedCashRegister;
		CashRegister updatedCashRegister;
		
		selectedCashRegister = cashRegisterServiceImpl.cashRegisterById(id);
		
		selectedCashRegister.setFloor(cr.getFloor());
		selectedCashRegister.setSales(cr.getSales());
		
		updatedCashRegister = cashRegisterServiceImpl.saveCashRegister(selectedCashRegister);
		
		return updatedCashRegister;
	}
	
	@DeleteMapping("/cashregisters/{id}")
	public void deleteCashRegister(@PathVariable(name="id") Long id) {
		cashRegisterServiceImpl.deleteCashRegister(id);
	}
}
