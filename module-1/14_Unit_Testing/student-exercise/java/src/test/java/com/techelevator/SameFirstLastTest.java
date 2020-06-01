package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {
	
	SameFirstLast sameFirstLastTest = new SameFirstLast();
	int[] nums;

	@Test
	public void lengthIsOneOrMoreAndFirstAndLastElementsAreEqual() {
		Assert.assertEquals(true, sameFirstLastTest.isItTheSame(nums = new int[] {1, 2, 3, 1}));
	}
	@Test
	public void LengthIsOneOrMoreAndFirstAndLastElementsAreNotEqual() {
		Assert.assertEquals(false, sameFirstLastTest.isItTheSame(nums = new int[] {1, 2, 3}));
	}
	@Test
	public void LengthIsOne() {
		Assert.assertEquals(true, sameFirstLastTest.isItTheSame(nums = new int[] {1}));
	}
	@Test
	public void arrayContainsNothing() {
		Assert.assertEquals(false, sameFirstLastTest.isItTheSame(nums = new int[] {}));
	}
	@Test
	public void arrayIsNull() {
		Assert.assertEquals(false, sameFirstLastTest.isItTheSame(nums = null));
	}
}



