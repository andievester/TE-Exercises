package com.techelevator.shoppingcart;

public class ShoppingCart {

	int totalNumberOfItems = 0;
	double totalAmountOwed = 0.0;
	
	public ShoppingCart() {
	}
	public double getAveragePricePerItem() {
		if (totalNumberOfItems == 0) {
			return 0;
		}
		return totalAmountOwed / totalNumberOfItems;
	}
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems = totalNumberOfItems + numberOfItems;
		totalAmountOwed = totalAmountOwed + pricePerItem * numberOfItems;
	}
	public void empty() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0.0;
	}
}
