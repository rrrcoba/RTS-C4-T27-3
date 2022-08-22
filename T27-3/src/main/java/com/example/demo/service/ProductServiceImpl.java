package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductDAO;
import com.example.demo.dto.Product;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	IProductDAO iProductDAO;

	@Override
	public List<Product> listAllProducts() {
		
		return iProductDAO.findAll();
	}

	@Override
	public Product saveProduct(Product p) {
		
		return iProductDAO.save(p);
	}

	@Override
	public Product productById(Long id) {
		
		return iProductDAO.findById(id).get();
	}

	@Override
	public Product updateProduct(Product p) {
		
		return iProductDAO.save(p);
	}

	@Override
	public void deleteProduct(Long id) {
		iProductDAO.deleteById(id);
		
	}

	
}
