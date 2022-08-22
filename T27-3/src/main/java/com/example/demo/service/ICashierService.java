package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cashier;

public interface ICashierService {
	
	/**
	 * Returns all Cashiers
	 * 
	 * @return the list
	 */
	public List<Cashier> listAllCashiers();
	
	/**
	 * Saves the Cashier
	 * 
	 * @param c
	 * @return the Cashier
	 */
	public Cashier saveCashier(Cashier c);
	
	/**
	 * Returns a Cashier
	 * 
	 * @param id
	 * @return the Cashier
	 */
	public Cashier cashierById(Long id);
	
	/**
	 * Updates the Cashier
	 * 
	 * @param c
	 * @return the Cashier
	 */
	public Cashier updateCashier(Cashier c);
	
	/**
	 * Deletes a Cashier
	 * 
	 * @param id
	 */
	public void deleteCashier(Long id);
}
