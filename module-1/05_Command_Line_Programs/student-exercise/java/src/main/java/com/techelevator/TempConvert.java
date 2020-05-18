package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		System.out.println("Please enter the temperature:");
		
		Scanner input = new Scanner(System.in); 
		String strTemperature = input.nextLine();
		double temperature = Double.parseDouble(strTemperature);
		
		System.out.println("Is the temperature in (C)elsius, or (F)arenheit?");
		
		String strWhichOne = input.nextLine();
		
		if (strWhichOne.equals("F")) {
			
			double farToCel = (temperature - 32) / 1.8;
			System.out.println((int)temperature + strWhichOne + " is " + (int)farToCel + "C.");
	} 
		else if (strWhichOne.equals("C")) {
		
			double celToFar = temperature * 1.8 + 32;	
			System.out.println((int)temperature + strWhichOne + " is " + (int)celToFar + "F.");
	}
		else {
			System.out.println("Please rerun and enter 'C' or 'F'");
		}
		}

	}


