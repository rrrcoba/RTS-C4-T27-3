package com.example.demo.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cash_register")
public class CashRegister {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private int floor;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Sale> sales;
	
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public CashRegister () {
		
	}

	/**
	 * Constructor using fields
	 * 
	 * @param id
	 * @param floor
	 * @param sales
	 */
	public CashRegister(Long id, int floor, List<Sale> sales) {
		this.id = id;
		this.floor = floor;
		this.sales = sales;
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
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}

	/**
	 * @param sales the sales to set
	 */
	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}
	
	/**
	 * @return the sales
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sale")
	public List<Sale> getSales() {
		return sales;
	}
}
