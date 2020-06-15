package com.techelevator;


public abstract class MovieRental {
	private String title;
	private String format;
	private boolean isPremium;
	
	
	public MovieRental(String title, String format, boolean isPremium) {
		this.setTitle(title);
		this.setFormat(format);
		this.setIsPremium(isPremium);
	}


	public abstract int getPrice();


	public boolean isPremium() {
		return isPremium;
	}

	public void setIsPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	protected abstract void setPrice(int price);
}
