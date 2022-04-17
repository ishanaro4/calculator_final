import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial for True Positive", 6, calculator.fact(3), DELTA);
        assertEquals("Finding factorial for True Positive", 720, calculator.fact(6), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial for False Positive", 24, calculator.fact(5), DELTA);
        assertNotEquals("Finding factorial for False Positive", 3, calculator.fact(3), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 27, calculator.power(3, 3), DELTA);
        assertEquals("Finding power for True Positive", 256, calculator.power(4, 4), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 7, calculator.power(3, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.power(2, 4), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6.3, calculator.naturalLog(2.5), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.34, calculator.naturalLog(2.14), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 3, calculator.sqroot(9), DELTA);
        assertEquals("Finding square root for True Positive", 5, calculator.sqroot(25), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.sqroot(2), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.sqroot(4), DELTA);

    }


}
