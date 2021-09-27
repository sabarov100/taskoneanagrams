package com.gmail.sabarov.e.taskoneanagrams;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class Reverse {

	private static final String SPACE = " ";

	public String reverseOfWordsExpectForSymbols(String argument) throws IOException {

		if (argument == null) {
			throw new IllegalArgumentException();
		}
		StringJoiner stringJoiner = new StringJoiner(SPACE);
		String[] words = argument.split(SPACE);
		for (String str : words) {
			stringJoiner.add(reverseWord(str));
		}
		return stringJoiner.toString();
	}

	public String reverseWord(String word) {

		StringBuilder builder = new StringBuilder();
		List<Character> reverse = new LinkedList<Character>();
		char[] letters = word.toCharArray();

		for (int i = 0; i < letters.length; i++) {
			if (Character.isLetter(letters[letters.length - 1 - i])) {
				reverse.add(letters[letters.length - 1 - i]);
			}
		}
		for (int i = 0; i < letters.length; i++) {
			if (!Character.isLetter(letters[i])) {
				reverse.add(i, letters[i]);
			}
		}
		for (Character a : reverse) {
			builder.append(a);
		}
		return builder.toString();
	}
}