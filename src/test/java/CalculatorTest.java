import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add_getsTwoIntegers_returnsSumOfThem() {
        int expected = 251;

        int actual = calculator.add(124, 127);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subtract_getsTwoIntegers_returnsDiffOfThem() {
        int expected = -498;

        int actual = calculator.subtract(101, 599);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiply_getsTwoIntegers_returnsMultiplicationOfThem() {
        int expected = -190480;

        int actual = calculator.multiply(-20, 9524);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide_getsTwoNonZeroIntegers_returnsResultOfDivisionAsDouble() {
        double expected = -9.94921875;

        double actual = calculator.divide(-2547, 256);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide_getsZeroAsFirstInteger_returnsZeroAsDouble() {
        double expected = 0.0;

        double actual = calculator.divide(0, 256);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide_getsZeroAsSecondInteger_throwsArithmeticException() {
        Assertions.assertThrows(ArithmeticException.class,
                () -> calculator.divide(250, 0)
        );
    }
}
