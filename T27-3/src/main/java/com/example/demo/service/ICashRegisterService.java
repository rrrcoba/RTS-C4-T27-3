package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CashRegister;

public interface ICashRegisterService {
	/**
	 * Lists all the CashRegister
	 * @return
	 */
	public List<CashRegister> listCashRegisters();
	
	/**
	 * Saves a CashRegister
	 * @param cr
	 * @return
	 */
	public CashRegister saveCashRegister(CashRegister cr);
	
	/**
	 * Gets the CashRegister by ID
	 * @param id
	 * @return
	 */
	public CashRegister cashRegisterById(Long id);
	
	/**
	 * Updates the CashRegister
	 * @param cr
	 * @return
	 */
	public CashRegister updateCashRegister(CashRegister cr);
	
	/**
	 * Deletes the CashRegister
	 * @param id
	 */
	public void deleteCashRegister(Long id);
}
