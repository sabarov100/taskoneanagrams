package com.gmail.sabarov.e.taskoneanagrams;

import java.io.IOException;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

import static java.lang.Character.isLetter;

public class Reverse {

	public static String reverseOfWordsExpectForSymbols(String argument) throws IOException {
		
		String whitespace = " ";
		StringJoiner stringJoiner = new StringJoiner(whitespace);
		String solution = reverseWord(argument);
		String[] words = argument.split(whitespace);
		if (words.length > 1) {
			for (int i = 0; i < words.length; i++) {
				stringJoiner.add(reverseWord(words[i]));
			}
			solution = stringJoiner.toString();
		}
		return solution;
	}

	public static String reverseWord(String word) {
		
		StringBuilder builder = new StringBuilder();
		List revers = new LinkedList();
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
		for (Object a : revers) {
			builder.append(a);
		}
		return builder.toString();
	}
}