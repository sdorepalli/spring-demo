package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {

		return product;

		/*
		 * productService.addProduct(product); return product;
		 */

	}

	@PostMapping("/productsupdate")	
     public ResponseEntity<Product> updaProduct(@RequestBody Product product) {
    	 Product p = productService.getProductById(product.getProductById());
    	 if (p == null) {
 			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
 		}
    	 p.setId(product.getId());
    	 p.setTitle(product.getTitle());
    	 p.setPrice(product.getPrice());
    	 p.setColor(product.getColor());
 		productService.updateProduct(p);
 		return new ResponseEntity<Product>(p,HttpStatus.OK);
 		
    	 
     }

}
