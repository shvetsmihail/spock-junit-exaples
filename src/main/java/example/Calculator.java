package example;

public class Calculator {

    private int value;

    public Calculator(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void add(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("negative value is not allow in this method");
        }
        value = value + i;
    }

    @Override
    public String toString() {
        return "Calculator toString method {" +
                "value=" + value +
                '}';
    }
}
