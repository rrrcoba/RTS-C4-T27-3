package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Product;

public interface IProductService {
	
	/**
	 * Lists all the Products
	 * @return
	 */
	public List<Product> listAllProducts();
	
	/**
	 * Saves a Product
	 * @param p
	 * @return
	 */
	public Product saveProduct(Product p);
	
	/**
	 * Gets the Product by ID
	 * @param id
	 * @return
	 */
	public Product productById(Long id);
	
	/**
	 * Updates the Product
	 * @param p
	 * @return
	 */
	public Product updateProduct(Product p);
	
	/**
	 * Deletes the Product
	 * @param id
	 */
	public void deleteProduct(Long id);

}
