package test.java.com.gmail.sabarov.e.taskoneanagrams;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import main.java.com.gmail.sabarov.e.taskoneanagrams.Reverse;

class ReverseTest {

    private static final String ALL_OPTIONS_ACTUAL = "Hel1o w0rld!";
    private static final String ALL_OPTIONS_EXPECTED = "ole1H d0lrw!";
    private static final String EMPTY_ACTUAL = "";
    private static final String EMPTY_EXPECTED = "";
    private static final String ONLY_LETTERS_ACTUAL = "HelloWorld";
    private static final String ONLY_LETTERS_EXPECTED = "dlroWolleH";
    private static final String ONLY_NUMBERS_ACTUAL = "0123456789";
    private static final String ONLY_NUMBERS_EXPECTED = "0123456789";
    private static final String ONLY_SYMBOLS_ACTUAL = "~!@#$%^&*() {}|:\"?><,./;'[]\\=-";
    private static final String ONLY_SYMBOLS_EXPECTED = "~!@#$%^&*() {}|:\"?><,./;'[]\\=-";
    private static final String LETTERS_AND_NUMBERS_ACTUAL = "He11oW0r1d";
    private static final String LETTERS_AND_NUMBERS_EXPECTED = "dr11Wo0e1H";
    private static final String LETTERS_AND_SYMBOLS_ACTUAL = "{Hello world!}";
    private static final String LETTERS_AND_SYMBOLS_EXPECTED = "{olleH dlrow!}";
    private static final String SYMBOLS_AND_NUMBERS_ACTUAL = "21! 37 & 73";
    private static final String SYMBOLS_AND_NUMBERS_EXPECTED = "21! 37 & 73";
    private static final String TEXT_ILLEGAL_ARGUMENT_EXCEPTION = "java.lang.IllegalArgumentException";
    
    
    @Before
    private static Reverse instance() {
        return new Reverse();
    }

    @Test
    void testAllOptionsReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(ALL_OPTIONS_EXPECTED, instance().reverseOfWordsExpectForSymbols(ALL_OPTIONS_ACTUAL));
    }
    
    @Test
    void testEmptyReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(EMPTY_EXPECTED, instance().reverseOfWordsExpectForSymbols(EMPTY_ACTUAL));
    }
    
    @Test
    void testOnlyLettersReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(ONLY_LETTERS_EXPECTED, instance().reverseOfWordsExpectForSymbols(ONLY_LETTERS_ACTUAL));
    }
    
    @Test
    void testOnlyNumbersReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(ONLY_NUMBERS_EXPECTED, instance().reverseOfWordsExpectForSymbols(ONLY_NUMBERS_ACTUAL));
    }
    
    @Test
    void testOnlySymbolsReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(ONLY_SYMBOLS_EXPECTED, instance().reverseOfWordsExpectForSymbols(ONLY_SYMBOLS_ACTUAL));
    }
    
    @Test
    void testLettersAndNumbersReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(LETTERS_AND_NUMBERS_EXPECTED, instance().reverseOfWordsExpectForSymbols(LETTERS_AND_NUMBERS_ACTUAL));
    }
    
    @Test
    void testLettersAndSymbolsReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(LETTERS_AND_SYMBOLS_EXPECTED, instance().reverseOfWordsExpectForSymbols(LETTERS_AND_SYMBOLS_ACTUAL));
    }
    
    @Test
    void testSymbolsAndNumbersReverseOfWordsExpectForSymbols() throws IOException {
        assertEquals(SYMBOLS_AND_NUMBERS_EXPECTED, instance().reverseOfWordsExpectForSymbols(SYMBOLS_AND_NUMBERS_ACTUAL));
    }
    
    @Test
    void testThrowsReverseOfWordsExpectForSymbols() throws IOException {
        String str = null;
        assertThrows(IllegalArgumentException.class, () -> instance().reverseOfWordsExpectForSymbols(str));
        assertEquals(TEXT_ILLEGAL_ARGUMENT_EXCEPTION, instance().exception.toString());
    }   
}
