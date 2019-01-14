package com.inrhythm.exercise;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class LongestWordModuleTests {

	@Test
	public void generalFindLongestWordInSentence() {
		LongestWordModule module = new LongestWordModule();
		ArrayList<String>  result = module.findLongestWordInSentence("Find the longest word here");
		assertEquals(result.get(0), "7");
		assertEquals(result.get(1), "longest");
		assertEquals(result.size(), 2);
	}
	
	@Test
	public void longestWordIsActuallyLongestWordNotWordThatHasPunctuationsAttachedToIt() {
		LongestWordModule module = new LongestWordModule();
		ArrayList<String>  result = module.findLongestWordInSentence("Find the longest word here, please!!!");
		assertEquals(result.get(0), "7");
		assertEquals(result.get(1), "longest");
		assertEquals(result.size(), 2);
	}
	
	@Test
	public void longestWordIsFirst() {
		LongestWordModule module = new LongestWordModule();
		ArrayList<String>  result = module.findLongestWordInSentence("Welcoming is the longest word?");
		assertEquals(result.get(0), "9");
		assertEquals(result.get(1), "Welcoming");
		assertEquals(result.size(), 2);
	}
	
	@Test
	public void longestWordIsLast() {
		LongestWordModule module = new LongestWordModule();
		ArrayList<String>  result = module.findLongestWordInSentence("The longest word is acrobatics.");
		assertEquals(result.get(0), "10");
		assertEquals(result.get(1), "acrobatics");
		assertEquals(result.size(), 2);
	}

	@Test
	public void allWordsThatAreTheLongestAreAccountedFor() {
		LongestWordModule module = new LongestWordModule();
		ArrayList<String>  result = module.findLongestWordInSentence("Welcome is the longest word?  How about atriums, salmons and fishing??");
		assertEquals(result.get(0), "7");
		assertEquals(result.get(1), "Welcome");
		assertEquals(result.get(2), "longest");
		assertEquals(result.get(3), "atriums");
		assertEquals(result.get(4), "salmons");
		assertEquals(result.get(5), "fishing");
		assertEquals(result.size(), 6);
	}
	
	@Test
	public void theLongestWordHasApostrophesButDontIncludeThemInTheCount() {
		LongestWordModule module = new LongestWordModule();
		ArrayList<String> result = module.findLongestWordInSentence("You wouldn't dare to test this right! Now would you?");
		assertEquals(result.get(0), "7");
		assertEquals(result.get(1), "wouldn't");
		assertEquals(result.size(), 2);
	}
	
	@Test
	public void theLongestWordIsTheActualLongestWordNotTheOneThatHasApostrophes() {
		LongestWordModule module = new LongestWordModule();
		ArrayList<String> result = module.findLongestWordInSentence("You wouldn't dare to test this right! Now would you, Mitchell?");
		assertEquals(result.get(0), "8");
		assertEquals(result.get(1), "Mitchell");
		assertEquals(result.size(), 2);
	}

	@Test
	public void allWordsThatAreTheLongestAreAccountedForIncludingOnesWithApostrophes() {
		LongestWordModule module = new LongestWordModule();
		ArrayList<String>  result = module.findLongestWordInSentence("Welcome is the longest word?  Wouldn't is as well???");
		assertEquals(result.get(0), "7");
		assertEquals(result.get(1), "Welcome");
		assertEquals(result.get(2), "longest");
		assertEquals(result.get(3), "Wouldn't");
		assertEquals(result.size(), 4);
	}
	
	@Test
	public void ifEmptyStringIsInputtedHaveResultsReflectIt() {
		LongestWordModule module = new LongestWordModule();
		ArrayList<String> result = module.findLongestWordInSentence("");
		assertEquals(result.get(0), "0");
		assertEquals(result.size(), 1);
	}
	
	@Test
	public void singleWordStringIsOnlyResult() {
		LongestWordModule module = new LongestWordModule();
		ArrayList<String> result = module.findLongestWordInSentence("Helping");
		assertEquals(result.get(0), "7");
		assertEquals(result.get(1), "Helping");
		assertEquals(result.size(), 2);
	}
	
	@Test
	public void capitalizationIsRetained() {
		LongestWordModule module = new LongestWordModule();
		ArrayList<String>  result = module.findLongestWordInSentence("FiNd tHe lOnGeSt WoRd HeRe");
		assertEquals(result.get(0), "7");
		assertEquals(result.get(1), "lOnGeSt");
		assertEquals(result.size(), 2);
	}
}
