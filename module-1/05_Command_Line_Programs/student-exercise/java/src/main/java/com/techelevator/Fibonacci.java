package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		int firstFib = 0;
		int secondFib = 1;
		
		System.out.println("Please enter your number:");
		
		Scanner input = new Scanner(System.in); 
		String strNum = input.nextLine();
		int num = Integer.parseInt(strNum);
		
		System.out.print(firstFib + " " + secondFib + " ");
		
		
		for (int i = 2; i < num; i ++) {
			int nextFib = firstFib + secondFib;
			
			if (nextFib > num) {
				break;
			}
			
			System.out.print(nextFib + " ");
			firstFib = secondFib;
			secondFib = nextFib;
			
			
			
			
			
		}
		
		
		
		
	
			
		}
		
		
		
	}


