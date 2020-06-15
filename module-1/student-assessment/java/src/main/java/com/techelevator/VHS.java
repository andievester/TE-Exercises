package com.techelevator;



public class VHS extends MovieRental {
	public VHS(String title, String format, boolean isPremium) {
		super(title, format, isPremium);
	}

	public int getPrice() {
		return 99;
	}

	@Override
	protected void setPrice(int price) {
		// TODO Auto-generated method stub
		
	}

}
