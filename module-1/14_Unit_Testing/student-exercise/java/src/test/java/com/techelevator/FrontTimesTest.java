package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

	FrontTimes frontTest = new FrontTimes();
	
	@Test
	public void stringHasThreeCharacters() {
		Assert.assertEquals("chochocho", frontTest.generateString("chocolate", 3));
		Assert.assertEquals("chocho", frontTest.generateString("chocolate", 2));
		Assert.assertEquals("cho", frontTest.generateString("chocolate", 1));
	}
	@Test
	public void stringHasTwoCharacters() {
		Assert.assertEquals("hihihi", frontTest.generateString("hi", 3));
		Assert.assertEquals("hihi", frontTest.generateString("hi", 2));
		Assert.assertEquals("hi", frontTest.generateString("hi", 1));
	}
	@Test
	public void stringHasOneCharacter() {
		Assert.assertEquals("xxx", frontTest.generateString("x", 3));
		Assert.assertEquals("xx", frontTest.generateString("x", 2));
		Assert.assertEquals("x", frontTest.generateString("x", 1));
	}
	@Test
	public void stringIsNull() {
		Assert.assertEquals("", frontTest.generateString(null, 3));
		Assert.assertEquals("", frontTest.generateString(null, 2));
		Assert.assertEquals("", frontTest.generateString(null, 1));
	}

}

