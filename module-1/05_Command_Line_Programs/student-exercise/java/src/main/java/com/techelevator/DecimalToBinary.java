package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
	
		System.out.println("Please enter your values separated by a space:");
		
		Scanner input = new Scanner(System.in); 
		String strUserResponse = input.nextLine();
		
		
		String[] strNumbersArr = strUserResponse.split(" ");
		int decimal = 0;
		
		for (int i = 0; i < strNumbersArr.length; i++) {
			 decimal = Integer.parseInt(strNumbersArr[i]);
			 System.out.println("Binary for " + decimal + " is " + Integer.toBinaryString(decimal));
			 
		}
		
	
		
		
		
		
		
		
	}

}
