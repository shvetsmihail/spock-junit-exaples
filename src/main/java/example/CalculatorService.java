package example;

public class CalculatorService {

    public int addAndGet(Calculator calc, int val) {
        calc.add(val);
        return calc.getValue();
    }
}
