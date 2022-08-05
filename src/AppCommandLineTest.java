import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class AppCommandLineTest {
    AppCommandLine app = new AppCommandLine();

    @Test
    public void isValidInputForA() {
        String a = "0";
        assertFalse("a should not be equal to 0.",app.isValidInputForA(a));
    }

    @Test
    public void isValidInputForB() {
        String b = "-9";
        assertFalse("b is restricted to be positive number.",app.isValidInputForB(b));
    }

    @Test
    public void fractionalBaseValue() {
        String b = "3.4";
        assertTrue("Fractional inputs must be entered as double values.",app.isValidInputForB(b));
    }

    @Test
    public void irrationalCheck() {
        String b = "√ 2 ";
        assertFalse("Code does not handle irrational values.",app.isValidInputForB(b));
    }

}