import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    double firstNum;
    double secondNum;
    private Calculator calculator = new Calculator(firstNum, secondNum);

    @Test
    void addsTwoNumbers() {
        assertEquals(8.0, calculator.add(6.0, 2.0));
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(4.0, calculator.sub(6.0, 2.0));
    }

    @Test
    void multipliesTwoNumbers() {
        assertEquals(12.0, calculator.mul(6.0, 2.0));
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(3.0, calculator.div(6.0, 2.0));

    }
}
