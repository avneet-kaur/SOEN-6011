import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is used to test functionality for class AppCommandLine.
 */
public class AppCommandLineTest {

    /**
     * Test Case ID: T1
     * It validates user-input value for A.
     */
    @Test
    public void isValidInputForA() {
        String a = "0";
        assertFalse("a should not be equal to 0.",AppCommandLine.isValidInputForA(a));
    }

    /**
     * Test Case ID: T2
     * It validates user-input value for B.
     */
    @Test
    public void isValidInputForB() {
        String b = "-9";
        assertFalse("b is restricted to be positive number.",AppCommandLine.isValidInputForB(b));
    }

    /**
     * Test Case ID: T3
     * It validates that fractional inputs must be entered as double values.
     */
    @Test
    public void fractionalBaseValue() {
        String b = "3.4";
        assertTrue("Fractional inputs must be entered as double values.",AppCommandLine.isValidInputForB(b));
    }

    /**
     * Test Case ID: T4
     * It validates that code does not handle irrational values.
     */
    @Test
    public void irrationalCheck() {
        String b = "√ 2 ";
        assertFalse("Code does not handle irrational values.",AppCommandLine.isValidInputForB(b));
    }

}