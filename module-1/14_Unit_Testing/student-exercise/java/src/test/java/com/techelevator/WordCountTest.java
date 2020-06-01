package com.techelevator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

	public class WordCountTest {
		WordCount wordCount = new WordCount();
		Map<Integer, String> wordMap = new HashMap<Integer, String>();
		String[] input;
	
	@Test
	public void dictionaryReturnsNumberOfTimesStringAppears() {
		Map<String, Integer> output = new HashMap<>();
		output.put("ba", 2);
		output.put("black", 1);
		output.put("sheep", 1);
		Assert.assertEquals(output, wordCount.getCount(input = new String[] {"ba", "ba", "black", "sheep"}));
	}
	@Test
	public void stringArrayIsNull() {
		Map<String, Integer> outputNull = new HashMap<>();
		Assert.assertEquals(outputNull, wordCount.getCount(input = null));
	}
}

