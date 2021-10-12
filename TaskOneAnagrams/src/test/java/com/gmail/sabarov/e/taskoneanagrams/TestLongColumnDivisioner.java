package test.java.com.gmail.sabarov.e.taskoneanagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import main.java.com.gmail.sabarov.e.taskoneanagrams.LongColumnDivisioner;


class TestLongColumnDivisioner {
    
    @Before
    private static LongColumnDivisioner setUp() {
        return  new LongColumnDivisioner();
    }
    
    private static String WITH_REMAINDER_EXPECTED = ""
            + "_78945|4\n"
            + " 4    |-----\n"
            + " -    |19736\n"
            + "_38\n"
            + " 36\n"
            + " --\n"
            + " _29\n"
            + "  28\n"
            + "  --\n"
            + "  _14\n"
            + "   12\n"
            + "   --\n"
            + "   _25\n"
            + "    24\n"
            + "    --\n"
            + "     1\n";
    
    private static String WITHOUT_REMAINDER_EXPECTED = ""
            + "_405022500|45\n"
            + " 405      |-------\n"
            + " ---      |9000500\n"
            + "    _225\n"
            + "     225\n"
            + "     ---\n"
            + "         0\n";
    
    private static final String TEXT_ILLEGAL_ARGUMENT_EXCEPTION = "java.lang.IllegalArgumentException: Divisor cannot be 0, division by zero";
    
    @Test
     void testWithRemainderLongColumnDivision() {
         assertEquals(WITH_REMAINDER_EXPECTED, setUp().longColumnDivision(78945, 4));

    }
    
    @Test
    void testWithoutRemainderLongColumnDivision() {
        assertEquals(WITHOUT_REMAINDER_EXPECTED, setUp().longColumnDivision(405022500, 45));

   }
    
    @Test
    void testMessegeIllegalArgumentExceptionLongColumnDivision() {
        assertEquals(TEXT_ILLEGAL_ARGUMENT_EXCEPTION, setUp().exception.toString());
    }
}