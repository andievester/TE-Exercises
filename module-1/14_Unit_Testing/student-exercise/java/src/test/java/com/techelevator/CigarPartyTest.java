package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {
	
	CigarParty cigarTest = new CigarParty();
	
	@Test
	public void successfulPartyOnAWeekday() {
		Assert.assertEquals(true, cigarTest.haveParty(50, false));
	}
	@Test
	public void unsuccessfulPartyOnAWeekday() {
		Assert.assertEquals(false, cigarTest.haveParty(70, false));
	}
	@Test
	public void successfulPartyOnAWeekend() {
		Assert.assertEquals(true, cigarTest.haveParty(1000, true));
	}
	@Test
	public void unsuccessfulPartyOnAWeekend() {
		Assert.assertEquals(false, cigarTest.haveParty(30, true));
	}
}
