package application;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testConvertBaseFourToBaseTen() {
        assertEquals(0, calculator.toDecimal("0"));
        assertEquals(1, calculator.toDecimal("1"));
        assertEquals(2, calculator.toDecimal("2"));
        assertEquals(4, calculator.toDecimal("10"));
        assertEquals(15, calculator.toDecimal("33"));
        assertEquals(63, calculator.toDecimal("333"));
    }

    @Test
    public void testSumOfNumbersBaseFour() {
        assertEquals("10", calculator.sumOfNumbers("2", "2"));
        assertEquals("311", calculator.sumOfNumbers("102", "203"));
    }

    @Test
    public void testSumOfNumbersBaseTen() {

    }

    @Test
    public void testDifferenceOfNumbersBaseFour() {
        assertEquals( "", calculator.differenceOfNumbers("", ""));
        assertEquals( "", calculator.differenceOfNumbers("", ""));
    }
    @Test
    public void testDifferenceOfNumbersBaseTen() {
        assertEquals( "", calculator.differenceOfNumbers("", ""));
        assertEquals( "", calculator.differenceOfNumbers("", ""));
    }
    @Test
    public void testMultiplicationOfNumbersBaseFour() {
        assertEquals( "", calculator.multiplicationOfNumbers("", ""));
        assertEquals( "", calculator.multiplicationOfNumbers("", ""));
    }
    @Test
    public void testMultiplicationOfNumbersBaseTen() {
        assertEquals( "", calculator.multiplicationOfNumbers("", ""));
        assertEquals( "", calculator.multiplicationOfNumbers("", ""));
    }
    @Test
    public void testDivisionOfNumbersBaseFour() {
        assertEquals( "", calculator.divisionOfNumbers("", ""));
        assertEquals( "", calculator.multiplicationOfNumbers("", ""));
    }
    @Test
    public void testDivisionOfNumbersBaseTen() {
        assertEquals( "", calculator.divisionOfNumbers("", ""));
        assertEquals( "", calculator.multiplicationOfNumbers("", ""));
    }

}