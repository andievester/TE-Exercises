package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {
	
	MaxEnd3 maxEndTest = new MaxEnd3();
	
	int[] nums;
	

	@Test
	public void lastIsLargest() {
		Assert.assertArrayEquals((new int[] {3, 3, 3}), maxEndTest.makeArray(new int[] {1, 2, 3}));
	}
	@Test
	public void firstIsLargest() {
		Assert.assertArrayEquals((new int[] {11, 11, 11}), maxEndTest.makeArray(new int[] {11, 5, 9}));
	}
	@Test
	public void allAreEqual() {
		Assert.assertArrayEquals((new int[] {11, 11, 11}), maxEndTest.makeArray(new int[] {11, 11, 11}));
	}

}




