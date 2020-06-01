package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {
	
	Less20 lessTest = new Less20();

	@Test
	public void isOneLessThanMultipleOf20() {
		Assert.assertEquals(true, lessTest.isLessThanMultipleOf20(39));
	}
	@Test
	public void isTwoLessThanMultipleOf20() {
		Assert.assertEquals(true, lessTest.isLessThanMultipleOf20(38));
	}
	@Test
	public void isMultipleOf20() {
		Assert.assertEquals(false, lessTest.isLessThanMultipleOf20(40));
	}
}

