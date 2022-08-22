package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_product")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="id_cash_register")
	private CashRegister cashRegister;
	
	@ManyToOne
	@JoinColumn(name="id_cashier")
	private Cashier cashier;
	
	
	//Constructors
	
	/**
	 * Default constructor
	 */
	public Sale () {
		
	}

	/**
	 * Constructor with fields
	 * 
	 * @param id
	 * @param product
	 * @param cash_register
	 * @param cashier
	 */
	public Sale(Long id, Product product, CashRegister cashRegister, Cashier cashier) {
		this.id = id;
		this.product = product;
		this.cashRegister = cashRegister;
		this.cashier = cashier;
	}

	
	// Getters and setters
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the cash_register
	 */
	public CashRegister getCashRegister() {
		return cashRegister;
	}

	/**
	 * @param cash_register the cash_register to set
	 */
	public void setCashRegister(CashRegister cashRegister) {
		this.cashRegister = cashRegister;
	}

	/**
	 * @return the cashier
	 */
	public Cashier getCashier() {
		return cashier;
	}

	/**
	 * @param cashier the cashier to set
	 */
	public void setCashier(Cashier cashier) {
		this.cashier = cashier;
	}
}
