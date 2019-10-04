package example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Example4ClosureJUnitTest {

    @Test
    public void integrationTest() {
        CalculatorService calculatorService = mock(CalculatorService.class);

//        when(calculatorService.addAndGet(new Calculator(2), eq(3))).thenReturn(5);

//        ArgumentMatcher<Calculator> calculatorArgumentMatcher = new ArgumentMatcher<Calculator>() {
//            public boolean matches(Calculator actualCalculator) {
//                return actualCalculator.getValue() == 2;
//            }
//        };
//        when(calculatorService.addAndGet(argThat(calculatorArgumentMatcher), eq(3))).thenReturn(5);

        when(calculatorService.addAndGet(argThat(calculator -> calculator.getValue() == 2), eq(3))).thenReturn(5);

        CalculatorServiceWrapper calculatorServiceWrapper = new CalculatorServiceWrapper(calculatorService);

        int result = calculatorServiceWrapper.addAndGet(2, 3);

        assertEquals(result, 5);
    }
}