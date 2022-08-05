import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("checkstyle:JavadocType")
public class AppCommandLineTest {

    @Test
    public void isValidInputForA() {
        String a = "0";
        assertFalse("a should not be equal to 0.",AppCommandLine.isValidInputForA(a));
    }

    @Test
    public void isValidInputForB() {
        String b = "-9";
        assertFalse("b is restricted to be positive number.",AppCommandLine.isValidInputForB(b));
    }

    @Test
    public void fractionalBaseValue() {
        String b = "3.4";
        assertTrue("Fractional inputs must be entered as double values.",AppCommandLine.isValidInputForB(b));
    }

    @Test
    public void irrationalCheck() {
        String b = "√ 2 ";
        assertFalse("Code does not handle irrational values.",AppCommandLine.isValidInputForB(b));
    }

}