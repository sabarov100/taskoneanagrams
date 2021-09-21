package com.gmail.sabarov.e.taskoneanagrams;

import java.io.IOException;

import java.util.LinkedList;

import static java.lang.Character.isLetter;

public class Reverse {

	public static String reverseOfWordsExpectForSymbols(String argument) throws IOException {
		
		StringBuilder builder = new StringBuilder();
		String solution = reverseWord(argument);
		String[] words = argument.split(" ");
		if (words.length > 1) {
			for (int i = 0; i < words.length; i++) {
				builder.append(reverseWord(words[i]));
			    if(i != (words.length - 1)) {
			    	builder.append(" ");
			    }
			}
			solution = builder.toString();
		}
		return solution;
	}

	public static String reverseWord(String word) {
		
		StringBuilder builder = new StringBuilder();
		LinkedList<Character> revers = new LinkedList<Character>();
		char[] letters = word.toCharArray();

		for (int i = 0; i < letters.length; i++) {
			if (isLetter(letters[letters.length - 1 - i])) {
				revers.add(letters[letters.length - 1 - i]);
			}
		}
		for (int i = 0; i < letters.length; i++) {
			if (!isLetter(letters[i])) {
				revers.add(i, letters[i]);
			}
		}
		for (char a : revers) {
			builder.append(a);
		}
		return builder.toString();
	}
}