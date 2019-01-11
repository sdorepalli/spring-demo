package com.spring.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Product;

@RestController
@RequestMapping("/services/products")
public class ProductController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Product> get() {
		
		List<Product> productList = new ArrayList<Product>();
		
		Product productOne = new Product();
		productOne.setId("111");
		productOne.setTitle("QC 35 I");
		productOne.setColor("Black");
		productOne.setPrice("$249.99");
		
		productList.add(productOne);
		
		Product productTwo = new Product();
		productTwo.setId("222");
		productTwo.setTitle("QC 35 II");
		productTwo.setColor("Black");
		productTwo.setPrice("$249.99");
		
		productList.add(productTwo);
		
		
		return productList;
	}

}
