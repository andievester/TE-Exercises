package com.techelevator;

public class BluRay extends MovieRental {
	public BluRay(String title, String format, boolean isPremium) {
		super(title, format, isPremium);
	}

	public int getPrice() {
		return 299;
	}

	@Override
	protected void setPrice(int price) {
		// TODO Auto-generated method stub
		
	}

}
