package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Product;
import com.spring.demo.service.ProductService;

@RestController
@RequestMapping("/productservices")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/gdallproducts")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping("/gdproductbytitle/{title}")
	public Product getProductBytitle(@PathVariable String title) {
		return productService.getProductBytitle(title);
	}

	@GetMapping("/gdproductbyid/{id}")
	public Product getProductById(@PathVariable String id) {
		return productService.getProductById(id);
	}

	@GetMapping("/gdproductbycolor/{color}")
	public Product getProductByColor(@PathVariable String color) {
		return productService.getProductByColor(color);

	}
}
