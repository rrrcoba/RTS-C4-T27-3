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

import com.example.demo.dto.Product;
import com.example.demo.service.ProductServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productServiceImpl.listAllProducts();
	}
	
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product p) {
		return productServiceImpl.saveProduct(p);
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable(name="id")Long id) {
		return productServiceImpl.productById(id);
	}
	
	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable(name="id")Long id, @RequestBody Product p) {
		Product selectedProduct;
		Product updatedProduct;
		
		selectedProduct = productServiceImpl.productById(id);
		
		selectedProduct.setName(p.getName());
		selectedProduct.setPrice(p.getPrice());
		selectedProduct.setSales(p.getSales());
		
		updatedProduct = productServiceImpl.saveProduct(selectedProduct);
		
		return updatedProduct;
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable(name="id")Long id) {
		productServiceImpl.deleteProduct(id);
	}
}
