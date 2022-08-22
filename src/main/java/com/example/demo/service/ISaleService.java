package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Sale;

public interface ISaleService {
	
	/**
	 * Lists all the Sales
	 * @return
	 */
	public List<Sale> listAllSales();
	
	/**
	 * Saves a Sale
	 * @param s
	 * @return
	 */
	public Sale saveSale(Sale s);
	
	/**
	 * Gets the Sale by ID
	 * @param id
	 * @return
	 */
	public Sale saleById(Long id);
	
	/**
	 * Updates the Sale
	 * @param s
	 * @return
	 */
	public Sale updateSale(Sale s);
	
	/**
	 * Deletes the Sale
	 * @param id
	 */
	public void deleteSale(Long id);

}