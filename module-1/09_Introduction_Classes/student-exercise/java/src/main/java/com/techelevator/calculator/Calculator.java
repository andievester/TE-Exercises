package com.techelevator.calculator;

public class Calculator {

	int result = 0;

	public Calculator() {
	}
	public int getResult() {
		return result;
	}
	public int add(int addEnd) {
		result = result + addEnd;
		return result;
	}
	public int multiply(int multiplier) {
		result = result * multiplier;
		return result;
	}
	public int power(int exponent) {
		if (exponent < 0) {
			exponent = exponent * -1;
		}
		result = (int) Math.pow(result, exponent);
		return result;
	}
	public void reset() {
		result = 0;
	}
	public int subtract(int subtrahend) {
		result = result - subtrahend;
		return result;
	}
}