package example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Example1SimpleJUnitTest {

    @Test
    public void simpleTest() {
        Calculator calc = new Calculator(2);

        calc.add(3);

        assertEquals(calc.getValue(), 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void simpleTestException() {
        Calculator calc = new Calculator(2);

        calc.add(-3);
    }

    @Test
    public void simpleTestDeepException() {
        Calculator calc = new Calculator(2);
        try {
            calc.add(-3);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "negative value is not allow in this method");
        }

    }
}