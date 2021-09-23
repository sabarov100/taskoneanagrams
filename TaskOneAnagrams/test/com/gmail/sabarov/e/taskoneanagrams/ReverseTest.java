package com.gmail.sabarov.e.taskoneanagrams;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class ReverseTest {

	Reverse reverseTest = new Reverse();
	@Test
	void testReverseOfWordsExpectForSymbols() throws IOException {
		assertEquals("ole1H d0lrw!", reverseTest.reverseOfWordsExpectForSymbols("Hel1o w0rld!"));
	}

}
