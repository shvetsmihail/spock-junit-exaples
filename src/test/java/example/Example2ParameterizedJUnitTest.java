package example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Example2ParameterizedJUnitTest {
    private int a;
    private int b;
    private int c;

    public Example2ParameterizedJUnitTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 3, 5},
                {3, 7, 10}
        });
    }

    @Test
    public void parameterizedTest() {
        Calculator calc = new Calculator(a);

        calc.add(b);

        assertEquals(calc.getValue(), c);
    }
}