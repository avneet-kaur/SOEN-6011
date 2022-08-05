import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ScientificCalculatorTest {


    @Test
    public void naturalExponential() {
        String a = "2";
        String b = "e";
        String x = "4";
        assertEquals("109.19630006611712",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

    @Test
    public void testZeroExponent() {
        String a = "2";
        String b = "11";
        String x = "0";
        assertEquals("2.0",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

    @Test
    public void testZeroBase() {
        String a = "2";
        String b = "0";
        String x = "3";
        assertEquals("0.0",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

    @Test
    public void testBase2() {
        String a = "2";
        String b = "2";
        String x = "3";
        assertEquals("16.0",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

    @Test
    public void testBase10() {
        String a = "2";
        String b = "10";
        String x = "3";
        assertEquals("2000.0",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

    @Test
    public void testExponentForNegativeValues() {
        String a = "2";
        String b = "2";
        String x = "-3";
        assertEquals("0.25",ScientificCalculator.calculateExponentialFunction(a,b,x));
    }

}