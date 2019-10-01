package example;

public class CalculatorServiceWrapper {
    private CalculatorService calculatorService;

    public CalculatorServiceWrapper(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int addAndGet(int val1, int val2) {
        Calculator calculator = new Calculator(val1);
        return calculatorService.addAndGet(calculator, val2);
    }
}
