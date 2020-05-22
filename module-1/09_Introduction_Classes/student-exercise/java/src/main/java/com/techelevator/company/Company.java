package com.techelevator.company;

public class Company {

	String name;
	int numberOfEmployees;
	double revenue;
	double expenses;

	public Company() {
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	public String getName() {
		return name;
	}
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public Double getRevenue() {
		return revenue;
	}
	public Double getExpenses() {
		return expenses;
	}
	public String getCompanySize() {
		String size = "small";
		if (numberOfEmployees > 50 && numberOfEmployees < 251) {
			size = "medium";
		}
		if (numberOfEmployees > 250) {
			size = "large";
		}
		return size;
	}
	
	public double getProfit() {
		return revenue - expenses;
	}
	
}
