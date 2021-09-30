package com.gmail.sabarov.e.taskoneanagrams;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ReverseTest {

    String ALL_OPTIONS_ACTUAL = "Hel1o w0rld!";
    String ALL_OPTIONS_EXPECTED = "ole1H d0lrw!";
    String EMPTY_ACTUAL = "";
    String EMPTY_EXPECTED = "";
    String ONLY_LETTERS_ACTUAL = "HelloWorld";
    String ONLY_LETTERS_EXPECTED = "dlroWolleH";
    String ONLY_NUMBERS_ACTUAL = "0123456789";
    String ONLY_NUMBERS_EXPECTED = "0123456789";
    String ONLY_SYMBOLS_ACTUAL = "~!@#$%^&*() {}|:\"?><,./;'[]\\=-";
    String ONLY_SYMBOLS_EXPECTED = "~!@#$%^&*() {}|:\"?><,./;'[]\\=-";
    String LETTERS_AND_NUMBERS_ACTUAL = "He11oW0r1d";
    String LETTERS_AND_NUMBERS_EXPECTED = "dr11Wo0e1H";
    String LETTERS_AND_SYMBOLS_ACTUAL = "{Hello world!}";
    String LETTERS_AND_SYMBOLS_EXPECTED = "{olleH dlrow!}";
    String SYMBOLS_AND_NUMBERS_ACTUAL = "21! 37 & 73";
    String SYMBOLS_AND_NUMBERS_EXPECTED = "21! 37 & 73";

    @Test @instance
    void testAllOptionsReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(ALL_OPTIONS_EXPECTED, instance.reverse.reverseOfWordsExpectForSymbols(ALL_OPTIONS_ACTUAL));
    }
    
    @Test @instance 
    void testEmptyReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(EMPTY_EXPECTED, instance.reverse.reverseOfWordsExpectForSymbols(EMPTY_ACTUAL));
    }
    
    @Test @instance
    void testOnlyLettersReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(ONLY_LETTERS_EXPECTED, instance.reverse.reverseOfWordsExpectForSymbols(ONLY_LETTERS_ACTUAL));
    }
    
    @Test @instance
    void testOnlyNumbersReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(ONLY_NUMBERS_EXPECTED, instance.reverse.reverseOfWordsExpectForSymbols(ONLY_NUMBERS_ACTUAL));
    }
    
    @Test @instance
    void testOnlySymbolsReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(ONLY_SYMBOLS_EXPECTED, instance.reverse.reverseOfWordsExpectForSymbols(ONLY_SYMBOLS_ACTUAL));
    }
    
    @Test @instance
    void testLettersAndNumbersReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(LETTERS_AND_NUMBERS_EXPECTED, instance.reverse.reverseOfWordsExpectForSymbols(LETTERS_AND_NUMBERS_ACTUAL));
    }
    
    @Test @instance
    void testLettersAndSymbolsReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(LETTERS_AND_SYMBOLS_EXPECTED, instance.reverse.reverseOfWordsExpectForSymbols(LETTERS_AND_SYMBOLS_ACTUAL));
    }
    
    @Test @instance
    void testSymbolsAndNumbersReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(SYMBOLS_AND_NUMBERS_EXPECTED, instance.reverse.reverseOfWordsExpectForSymbols(SYMBOLS_AND_NUMBERS_ACTUAL));
    }
    
    @Test @instance
    void testNotNullReverseOfWordsExpectForSymbols() throws IOException {
        String str = null;
        try {
            Assert.assertNotNull(instance.reverse.reverseOfWordsExpectForSymbols(str));
        }
        catch (IllegalArgumentException exception) {
            str = "";
        }
    }
    
        @Test @instance
    void testThrowsReverseOfWordsExpectForSymbols() throws IOException {
        String str = null;
        Assert.assertThrows(IllegalArgumentException.class, () -> instance.reverse.reverseOfWordsExpectForSymbols(str));
    }   
}
