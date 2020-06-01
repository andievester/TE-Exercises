package com.techelevator;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {

	AnimalGroupName animalGroup;
	static Map<String, String> animals;
	
	@Before
	public void setup() {
		animalGroup = new AnimalGroupName();
		
	}
	
	@Test
	public void getHerdWorksAsExpected() {
		String successfulAnimal = "rhino";
		String successfulAnimalOneCap = "Rhino";
		String successfulAnimalAllCaps = "RHINO";
		
		Assert.assertEquals("Crash", animalGroup.getHerd(successfulAnimal));
		Assert.assertEquals("Crash", animalGroup.getHerd(successfulAnimalOneCap));
		Assert.assertEquals("Crash", animalGroup.getHerd(successfulAnimalAllCaps));
	}
	@Test
	public void animalNotInListFailsAsExpected() {
		String unsuccessfulAnimal = "cat";
		String unsuccessfulResult = animalGroup.getHerd(unsuccessfulAnimal);
		Assert.assertEquals("unknown", unsuccessfulResult);	
	}
	@Test
	public void getHerdFailsWithNullValuePassedIn() {
		String nullString = null;
		String nullResult = animalGroup.getHerd(nullString);
		Assert.assertEquals("unknown", nullResult);
	}
	
}

