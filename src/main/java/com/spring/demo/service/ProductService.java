package com.spring.demo.service;

import java.util.List;

import com.spring.demo.model.Product;

public interface ProductService {

	
	public List<Product> getAllProducts();

	public Product getProductBytitle(String title);
	
	public Product getProductById(String id);
	
	public Product getProductByColor(String color);
	
	public Product getProductByPrice(String price);
	
	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public Product deleteProduct(String title); 
	
	
	
	
	
	
}
