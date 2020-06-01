package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {
	
	NonStart nonStartTest = new NonStart();

	@Test
	public void partialStringsAreConcatenated() {
		Assert.assertEquals("ellohere", nonStartTest.getPartialString("Hello", "There"));
	}
	@Test
	public void stringALengthIsZero() {
		Assert.assertEquals("ava", nonStartTest.getPartialString("", "lava"));
	}
	@Test 
	public void stringBLengthIsZero() {
		Assert.assertEquals("ot", nonStartTest.getPartialString("hot", ""));
	}
}

