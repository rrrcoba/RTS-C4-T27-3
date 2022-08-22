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
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private double price;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Sale> sales;
	
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Product () {
		
	}

	/**
	 * Constructor using fields
	 * 
	 * @param id
	 * @param name
	 * @param price
	 * @param sales
	 */
	public Product(Long id, String name, double price, List<Sale> sales) {
		this.id = id;
		this.name = name;
		this.price = price;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
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