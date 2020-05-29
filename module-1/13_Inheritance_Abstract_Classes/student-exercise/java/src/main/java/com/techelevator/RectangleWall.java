package com.techelevator;

public class RectangleWall extends Wall {
	
	protected int length;
	protected int height;
	
	
	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
		
	}
	protected RectangleWall(String name, String color) {
		super(name, color);
	}
	
	public int getLength() {
		return length;
	}


	public int getHeight() {
		return height;
	}
	
	@Override
	public int getArea() {
		return (length * height);
	}
	public String toString() {
		return getName() + " (" + length + "x" + height + ") " + "rectangle";
		
	}
}
