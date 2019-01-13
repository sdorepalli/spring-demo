package com.spring.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {



	public List<Product> getAllProducts() {

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
		productTwo.setColor("Blue");
		productTwo.setPrice("$249.99");

		productList.add(productTwo);

		return productList;

	}

	@Override
	public Product getProductBytitle(String title) {

		List<Product> l = getAllProducts();
		Product result = null;

		for (Product p : l) {

			System.out.println("for p : " + p.getTitle());
			result = p;
			if (p.getTitle().equalsIgnoreCase(title)) {
				break;
			}
		}

		return result;
	}

	@Override
	public Product getProductById(String id) {
		Product result = null;
		List<Product> l = getAllProducts();
		for (Product p : l) {
			if (p.getId().equalsIgnoreCase(id)) {
				result = p;
				break;
			}

		}

		return result;
	}

	@Override
	public Product getProductByColor(String color) {

		Product result = null;
		List<Product> l = getAllProducts();
		for (Product p : l) {
			if (p.getColor().equalsIgnoreCase(color)) {
				result = p;
				break;
			}
		}
		return result;
	}

	@Override
	public Product getProductByPrice(String price) {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addProduct(Product product) {
		addProduct(product);
		return product;

	}

	@Override
	public Product updateProduct(Product product) {
		return product;
       
		/*
		 * for (Product oldProduct : product) { if (oldProduct.getId() ==
		 * product.getId()) { oldProduct.setColor(product.getColor());
		 * oldProduct.setTitle(product.getTitle());
		 * oldProduct.setPrice(product.getPrice());
		 */
		

	}



	@Override
	public Product deleteProduct(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
