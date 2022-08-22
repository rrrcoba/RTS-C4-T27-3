package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISaleDAO;
import com.example.demo.dto.Sale;

@Service
public class SaleServiceImpl implements ISaleService{
	
	@Autowired
	ISaleDAO iSaleDAO;

	@Override
	public List<Sale> listAllSales() {

		return iSaleDAO.findAll();
	}

	@Override
	public Sale saveSale(Sale s) {
		
		return iSaleDAO.save(s);
	}

	@Override
	public Sale saleById(Long id) {
		
		return iSaleDAO.findById(id).get();
	}

	@Override
	public Sale updateSale(Sale s) {
		
		return iSaleDAO.save(s);
	}

	@Override
	public void deleteSale(Long id) {
		iSaleDAO.deleteById(id);
	}

	
}
