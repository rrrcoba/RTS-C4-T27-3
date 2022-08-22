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

import com.example.demo.dto.Sale;
import com.example.demo.service.SaleServiceImpl;

@RestController
@RequestMapping("/api")
public class SaleController {

	@Autowired
	SaleServiceImpl saleServiceImpl;

	@GetMapping("/sales")
	public List<Sale> getAllSales() {
		return saleServiceImpl.listAllSales();
	}

	@PostMapping("/sales")
	public Sale saveSale(@RequestBody Sale s) {
		return saleServiceImpl.saveSale(s);
	}

	@GetMapping("/sales/{id}")
	public Sale getSaleById(@PathVariable(name = "id") Long id) {
		return saleServiceImpl.saleById(id);
	}

	@PutMapping("/sales/{id}")
	public Sale updateSale(@PathVariable(name = "id") Long id, @RequestBody Sale s) {
		Sale selectedSale;
		Sale updatedSale;

		selectedSale = saleServiceImpl.saleById(id);

		selectedSale.setProduct(s.getProduct());
		selectedSale.setCashRegister(s.getCashRegister());
		selectedSale.setCashier(s.getCashier());

		updatedSale = saleServiceImpl.saveSale(selectedSale);

		return updatedSale;
	}

	@DeleteMapping("/sales/{id}")
	public void deleteSale(@PathVariable(name = "id") Long id) {
		saleServiceImpl.deleteSale(id);
	}
}
