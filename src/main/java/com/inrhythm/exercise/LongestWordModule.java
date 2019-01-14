package com.inrhythm.exercise;

import java.util.ArrayList;

public class LongestWordModule {

	//ASSUMPTIONS
	//A string will always be passed
	//The return array will always have a size of at least 1
	//The first element in the array is the size of the longest words
	//Every element after that is one of the longest words in order of appearance
	//Elements returned still hold the same capitalization that they had in the original string
	//Apostrophes remain in the word but are not part of the letter count
	//All other punctuation is removed from the word when they are being displayed in output
	public ArrayList<String> findLongestWordInSentence(String sentence) {
		String[] words = sentence.split(" ");
		int longestWordSize = 0;
		ArrayList<String> longestWords = new ArrayList<String>();
		
		for(int i = 0; i < words.length; i++) {
			int currentWordLength = words[i].replaceAll("[^a-zA-Z ]", "").length();
			if(currentWordLength > longestWordSize) {
				longestWordSize = currentWordLength;
				longestWords.clear();
				longestWords.add(words[i].replaceAll("[^a-zA-Z ']", ""));
			}
			else if (currentWordLength == longestWordSize && longestWordSize != 0 ) {
				longestWords.add(words[i].replaceAll("[^a-zA-Z ']", ""));
			}
		}
	
		longestWords.add(0, Integer.toString(longestWordSize));
		return longestWords;
	}
	
}
