package com.techelevator;

public  class DVD extends MovieRental {
	public DVD(String title, String format, boolean isPremium) {
		super(title, format, isPremium);
	}

	public int getPrice() {
		return 199;
	}

	@Override
	protected void setPrice(int price) {
		// TODO Auto-generated method stub
		
	}

}
