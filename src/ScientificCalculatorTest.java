import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This class is testing functionality for ScientificCalculator class.
 */
public class ScientificCalculatorTest {

    /**
     * Test Case ID: T5
     * Validated correctness of Natural exponential function.
     */
    @Test
    public void naturalExponential() {
        String a = "2";
        String b = "e";
        String x = "4";
        assertEquals("109.19630006611712",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

    /**
     * Test Case ID: T6
     * Test case for exponent value = 0, that b^x should return 1.
     */
    @Test
    public void testZeroExponent() {
        String a = "2";
        String b = "11";
        String x = "0";
        assertEquals("2.0",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

    /**
     * Test Case ID: T7
     * Test case for base value = 0, that calculator returns 0.0.
     */
    @Test
    public void testZeroBase() {
        String a = "2";
        String b = "0";
        String x = "3";
        assertEquals("0.0",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

    /**
     * Test Case ID: T8
     * Test case for exponential function.
     */
    @Test
    public void testBase2() {
        String a = "2";
        String b = "2";
        String x = "3";
        assertEquals("16.0",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

    /**
     * Test Case ID: T9
     * Test case for base value = 10.
     */
    @Test
    public void testBase10() {
        String a = "2";
        String b = "10";
        String x = "3";
        assertEquals("2000.0",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

    /**
     * Test Case ID: T10
     * Testing correctness for negative exponent value.
     */
    @Test
    public void testExponentForNegativeValues() {
        String a = "2";
        String b = "2";
        String x = "-3";
        assertEquals("0.25",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

}