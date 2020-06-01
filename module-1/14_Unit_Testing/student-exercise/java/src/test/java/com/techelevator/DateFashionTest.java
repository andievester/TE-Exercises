package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {
	
	DateFashion date = new DateFashion();

	@Test
	public void dateIsVeryFashionable() {
		Assert.assertEquals(2, date.getATable(8, 10));
	}
	@Test
	public void IAmVeryFashionable() {
		Assert.assertEquals(2, date.getATable(8, 4));
	}
	@Test
	public void DateIsNotFashionable() {
		Assert.assertEquals(0, date.getATable(8, 1));
	}
	@Test
	public void IAmNotFashionable() {
		Assert.assertEquals(0, date.getATable(2, 9));
	}
	@Test
	public void WeAreKindaFashionable() {
		Assert.assertEquals(1, date.getATable(4, 7));
	}
	
}


