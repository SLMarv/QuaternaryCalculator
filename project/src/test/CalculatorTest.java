import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import main.java.Calculator

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testConvertBaseFourToBaseTen() {
        assertEquals(0, calculator.convertBaseFourToBaseTen("0"));
        assertEquals(1, calculator.convertBaseFourToBaseTen("1"));
        assertEquals(2, calculator.convertBaseFourToBaseTen("2"));
        assertEquals(4, calculator.convertBaseFourToBaseTen("10"));
        assertEquals(15, calculator.convertBaseFourToBaseTen("33"));
        assertEquals(63, calculator.convertBaseFourToBaseTen("333"));
    }

    @Test
    public void testSumOfNumbersBaseFour() {
        assertEquals(10, calculator.sumOfNumbers("2", "3", false));

    }

    @Test
    public void testSumOfNumbersBaseTen() {

    }
}