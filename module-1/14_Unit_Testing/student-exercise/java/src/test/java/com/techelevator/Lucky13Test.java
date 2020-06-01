
package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {
	
	Lucky13 luckyTest = new Lucky13();
	
	int[] nums;

	@Test
	public void containsNoOnesAndNoThrees() {
		Assert.assertEquals(true, luckyTest.getLucky(new int[] {0, 2, 4}));
	}
	@Test
	public void containsOnes() {
		Assert.assertEquals(false, luckyTest.getLucky(new int[] {1, 2, 4}));	
	}
	@Test
	public void containsThrees() {
		Assert.assertEquals(false, luckyTest.getLucky(new int[] {3, 2, 4}));
	}
	@Test
	public void containsThreesAndOnes() {
		Assert.assertEquals(false, luckyTest.getLucky(new int[] {3, 2, 1}));
	}
	@Test
	public void containsNothing() {
		Assert.assertEquals(true, luckyTest.getLucky(nums = null));
	}
}



