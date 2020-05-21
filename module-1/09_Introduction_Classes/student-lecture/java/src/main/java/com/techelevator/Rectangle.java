package com.techelevator;

public class Rectangle {
	private int height;
	private int width;
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int h) {
		if (h > 0) {
			height = h;
		}
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int w) {
		if (w > 0) {
			width = w;
		}
	}
}
