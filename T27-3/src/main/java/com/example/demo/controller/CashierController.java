package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.Cashier;
import com.example.demo.service.CashierServiceImpl;

@RestController
@RequestMapping("/api")
public class CashierController {
	
	@Autowired
	CashierServiceImpl cashierServiceImpl;
	
	@GetMapping("/cashiers")
	public List<Cashier> getAllCashiers() {
		return cashierServiceImpl.listAllCashiers();
	}
	
	@PostMapping("/cashiers")
	public Cashier saveCashier(@RequestBody Cashier c) {
		return cashierServiceImpl.saveCashier(c);
	}
	
	@GetMapping("/cashiers/{id}")
	public Cashier getCashierById(@PathVariable(name = "id") Long id) {
		return cashierServiceImpl.cashierById(id);
	}
	
	@PutMapping("/cashiers/{id}")
	public Cashier updateCashier(@PathVariable(name = "id") Long id, @RequestBody Cashier c) {
		Cashier selectedCashier;
		Cashier updatedCashier;

		selectedCashier = cashierServiceImpl.cashierById(id);

		selectedCashier.setNameSurname(c.getNameSurname());
		selectedCashier.setSales(c.getSales());

		updatedCashier = cashierServiceImpl.saveCashier(selectedCashier);

		return updatedCashier;
	}
	
	@DeleteMapping("/cashiers/{id}")
	public void deleteCashier(@PathVariable(name = "id") Long id) {
		cashierServiceImpl.deleteCashier(id);
	}
}
