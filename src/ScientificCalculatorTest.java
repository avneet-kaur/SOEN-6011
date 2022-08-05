import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

public class ScientificCalculatorTest {
    ScientificCalculator sc = new ScientificCalculator();


    @Test
    public void naturalExponential() {
        String a = "2";
        String b = "e";
        String x = "4";
        assertEquals("109.19630006611712",sc.calculateExponentialFunction(a,b,x));
    }

    @Test
    public void testZeroExponent() {
        String a = "2";
        String b = "11";
        String x = "0";
        assertEquals("2.0",sc.calculateExponentialFunction(a,b,x));
    }

    @Test
    public void testZerobase() {
        String a = "2";
        String b = "0";
        String x = "3";
        assertEquals("0.0",sc.calculateExponentialFunction(a,b,x));
    }

    @Test
    public void testbase2() {
        String a = "2";
        String b = "2";
        String x = "3";
        assertEquals("16.0",sc.calculateExponentialFunction(a,b,x));
    }

    @Test
    public void testbase10() {
        String a = "2";
        String b = "10";
        String x = "3";
        assertEquals("2000.0",sc.calculateExponentialFunction(a,b,x));
    }

    @Test
    public void testExponentForNegativeValues() {
        String a = "2";
        String b = "2";
        String x = "-3";
        assertEquals("0.25",sc.calculateExponentialFunction(a,b,x));
    }

}