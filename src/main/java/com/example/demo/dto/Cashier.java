package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
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
@Table(name="cashiers")
public class Cashier {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name_surname")
	private String nameSurname;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Sale> sales;
	
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Cashier() {
	}


	/**
	 * Constructor with fields
	 * 
	 * @param id
	 * @param nameSurname
	 * @param sales
	 */
	public Cashier(Long id, String nameSurname, List<Sale> sales) {
		this.id = id;
		this.nameSurname = nameSurname;
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
	 * @return the nameSurname
	 */
	public String getNameSurname() {
		return nameSurname;
	}


	/**
	 * @param nameSurname the nameSurname to set
	 */
	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}


	/**
	 * @return the sales
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sale")
	public List<Sale> getSales() {
		return sales;
	}


	/**
	 * @param sales the sales to set
	 */
	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}
}
