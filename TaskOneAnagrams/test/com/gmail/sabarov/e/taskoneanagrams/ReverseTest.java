package com.gmail.sabarov.e.taskoneanagrams;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ReverseTest {
	
	String ALL_OPTIONS_ACTUAL = "Hel1o w0rld!";
	String ALL_OPTIONS_EXPECTED = "ole1H d0lrw!";
	String EMPTY = "";
	String ONLY_LETTERS_ACTUAL = "HelloWorld";
	String ONLY_LETTERS_EXPECTED = "dlroWolleH";
	String ONLY_NUMBERS = "0123456789";
	String ONLY_SYMBOLS = "~!@#$%^&*() {}|:\"?><,./;'[]\\=-";
	String LETTERS_AND_NUMBERS_ACTUAL = "He11oW0r1d";
	String LETTERS_AND_NUMBERS_EXPECTED = "dr11Wo0e1H";
	String LETTERS_AND_SYMBOLS_ACTUAL = "{Hello world!}";
	String LETTERS_AND_SYMBOLS_EXPECTED = "{olleH dlrow!}";
	String SYMBOLS_AND_NUMBERS = "21! 37 & 73";

	@Test
	void testAllOptionsReverseOfWordsExpectForSymbols() throws IOException {
		Reverse reverseTest = new Reverse();
		assertEquals(ALL_OPTIONS_EXPECTED, reverseTest.reverseOfWordsExpectForSymbols(ALL_OPTIONS_ACTUAL));
	}
	@Test
	void testEmptyReverseOfWordsExpectForSymbols() throws IOException {
		Reverse reverseTest = new Reverse();
		assertEquals(EMPTY, reverseTest.reverseOfWordsExpectForSymbols(EMPTY));
	}
	@Test
	void testOnlyLettersReverseOfWordsExpectForSymbols() throws IOException {
		Reverse reverseTest = new Reverse();
		assertEquals(ONLY_LETTERS_EXPECTED, reverseTest.reverseOfWordsExpectForSymbols(ONLY_LETTERS_ACTUAL));
	}
	@Test
	void testOnlyNumbersReverseOfWordsExpectForSymbols() throws IOException {
		Reverse reverseTest = new Reverse();
		assertEquals(ONLY_NUMBERS, reverseTest.reverseOfWordsExpectForSymbols(ONLY_NUMBERS));
	}
	@Test
	void testOnlySymbolsReverseOfWordsExpectForSymbols() throws IOException {
		Reverse reverseTest = new Reverse();
		assertEquals(ONLY_SYMBOLS, reverseTest.reverseOfWordsExpectForSymbols(ONLY_SYMBOLS));
	}
	@Test
	void testLettersAndNumbersReverseOfWordsExpectForSymbols() throws IOException {
		Reverse reverseTest = new Reverse();
		assertEquals(LETTERS_AND_NUMBERS_EXPECTED, reverseTest.reverseOfWordsExpectForSymbols(LETTERS_AND_NUMBERS_ACTUAL));
	}
	@Test
	void testLettersAndSymbolsReverseOfWordsExpectForSymbols() throws IOException {
		Reverse reverseTest = new Reverse();
		assertEquals(LETTERS_AND_SYMBOLS_EXPECTED, reverseTest.reverseOfWordsExpectForSymbols(LETTERS_AND_SYMBOLS_ACTUAL));
	}
	@Test
	void testSymbolsAndNumbersReverseOfWordsExpectForSymbols() throws IOException {
		Reverse reverseTest = new Reverse();
		assertEquals(SYMBOLS_AND_NUMBERS, reverseTest.reverseOfWordsExpectForSymbols(SYMBOLS_AND_NUMBERS));
	}
	@Test
	void testNotNullReverseOfWordsExpectForSymbols() throws IOException, IllegalArgumentException {
		Reverse reverseTest = new Reverse();
		String str = "null";
		Assert.assertNotNull(reverseTest.reverseOfWordsExpectForSymbols(str));
	}
}
