package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		System.out.println("Please enter the length of your item:");

		Scanner input = new Scanner(System.in); 
		String strLength = input.nextLine();
		double length = Double.parseDouble(strLength);
		
		System.out.println("Is the length in (M)eters, or (F)eet?");
		
		String strWhichOne = input.nextLine();
		
		if (strWhichOne.equals("M")) {
			
			double metToFeet = (length * 3.2808399);
			System.out.println((int)length + strWhichOne + " is " + (int)metToFeet + " feet.");
	}
		else if (strWhichOne.equals("F")) {
			
			double feetToMet = (length * 0.3048);	
			System.out.println((int)length + strWhichOne + " is " + (int)feetToMet + " meters.");
	}
		else {
			System.out.println("Please rerun and enter 'M' or 'F'.");
		}
	}
	
}
