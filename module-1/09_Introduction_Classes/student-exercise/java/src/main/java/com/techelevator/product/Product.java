package com.techelevator.product;

public class Product {

	String name;
	double price;
	double weightInOunces;
	
	public Product() {
	}
	public void setName (String name) {
		this.name = name;
	}
	public void setPrice (double price) {
		this.price = price;
	}
	public void setWeightInOunces (double weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public double getWeightInOunces() {
		return weightInOunces;
	}
}