package com.spring.demo.model;

public class Product {

	public Product() {
		
		System.out.println("in default constructor..");
	}
	
	public Product(String id, String title, String color, String price) {
		super();
		this.id = id;
		this.title = title;
		this.color = color;
		this.price = price;
	}

	private String id;

	private String title;

	private String color;

	private String price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
