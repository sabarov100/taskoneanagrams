package com.gmail.sabarov.e.taskoneanagrams;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class ReverseTest {

	@Test
	void testReverseOfWordsExpectForSymbols() throws IOException {
		assertEquals("ole1H d0lrw!", Reverse.reverseOfWordsExpectForSymbols("Hel1o w0rld!"));
	}

}
