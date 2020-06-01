package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {
	
	StringBits bitsTest = new StringBits();

	@Test
	public void newStringHasEveryOtherCharacter() {
		Assert.assertEquals("Hlo", bitsTest.getBits("Hello"));
	}
	@Test
	public void nullStringReturnsNull() {
		Assert.assertEquals("", bitsTest.getBits(null));
	}

}

