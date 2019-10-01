package example;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class Example3MockJUnitTest {

    @Test
    public void mockTest() {
        Calculator calc = mock(Calculator.class);
        when(calc.getValue()).thenReturn(5);

        calc.add(3);

        assertEquals(calc.getValue(), 5);

        verify(calc).add(3);
        verify(calc).getValue();
    }
}