package com.gmail.sabarov.e.taskoneanagrams;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class ReverseTest {

	Reverse reverseTest = new Reverse();
	@Test
	void testAllOptionsReverseOfWordsExpectForSymbols() throws IOException {
		assertEquals("ole1H d0lrw!", reverseTest.reverseOfWordsExpectForSymbols("Hel1o w0rld!"));
	}
	@Test
	void testEmptyReverseOfWordsExpectForSymbols() throws IOException {
		assertEquals("", reverseTest.reverseOfWordsExpectForSymbols(""));
	}
	@Test
	void testOnlyLettersReverseOfWordsExpectForSymbols() throws IOException {
		assertEquals("dlroWolleH", reverseTest.reverseOfWordsExpectForSymbols("HelloWorld"));
	}
	@Test
	void testOnlyNumbersReverseOfWordsExpectForSymbols() throws IOException {
		assertEquals("0123456789", reverseTest.reverseOfWordsExpectForSymbols("0123456789"));
	}
	@Test
	void testOnlySymbolsReverseOfWordsExpectForSymbols() throws IOException {
		assertEquals("~!@#$%^&*() {}|:\"?><,./;'[]\\=-", reverseTest.reverseOfWordsExpectForSymbols("~!@#$%^&*() {}|:\"?><,./;'[]\\=-"));
	}
	@Test
	void testLettersAndNumbersReverseOfWordsExpectForSymbols() throws IOException {
		assertEquals("dr11Wo0e1H", reverseTest.reverseOfWordsExpectForSymbols("He11oW0r1d"));
	}
	@Test
	void testLettersAndSymbolsReverseOfWordsExpectForSymbols() throws IOException {
		assertEquals("{olleH dlrow!}", reverseTest.reverseOfWordsExpectForSymbols("{Hello world!}"));
	}
	@Test
	void testSymbolsAndNumbersReverseOfWordsExpectForSymbols() throws IOException {
		assertEquals("21! 37 & 73", reverseTest.reverseOfWordsExpectForSymbols("21! 37 & 73"));
	}
}
