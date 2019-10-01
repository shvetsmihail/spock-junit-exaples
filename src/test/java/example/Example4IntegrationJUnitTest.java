package example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Example4IntegrationJUnitTest {

    @Test
    public void integrationTest() {
        CalculatorService calculatorService = new CalculatorService();
        CalculatorServiceWrapper calculatorServiceWrapper = new CalculatorServiceWrapper(calculatorService);

        int result = calculatorServiceWrapper.addAndGet(2, 3);

        assertEquals(result, 5);
    }
}