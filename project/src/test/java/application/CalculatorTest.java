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
    void toDecimal() {
        assertEquals(0, calculator.toDecimal("0"));
        assertEquals(1, calculator.toDecimal("1"));
        assertEquals(2, calculator.toDecimal("2"));
        assertEquals(4, calculator.toDecimal("10"));
        assertEquals(15, calculator.toDecimal("33"));
        assertEquals(63, calculator.toDecimal("333"));
    }

    @Test
    void toQuaternary() {
        assertEquals("0", calculator.toQuaternary(0));
        assertEquals("1", calculator.toQuaternary(1));
        assertEquals("2", calculator.toQuaternary(2));
        assertEquals("10", calculator.toQuaternary(4));
        assertEquals("33", calculator.toQuaternary(15));
        assertEquals("333", calculator.toQuaternary(63));
    }

    @Test
    void sumOfNumbers() {
        assertEquals("10", calculator.sumOfNumbers("2", "2"));
        assertEquals("311", calculator.sumOfNumbers("102", "203"));
    }

    @Test
    void differenceOfNumbers() {
        assertEquals( "2", calculator.differenceOfNumbers("3", "1"));
        assertEquals( "3", calculator.differenceOfNumbers("10", "1"));
    }

    @Test
    void multiplicationOfNumbers() {
        assertEquals( "1", calculator.multiplicationOfNumbers("1", "1"));
        assertEquals( "30", calculator.multiplicationOfNumbers("10", "3"));
    }

    @Test
    void divisionOfNumbers() {
        assertEquals( "2", calculator.divisionOfNumbers("10", "2"));
        assertEquals( "10", calculator.divisionOfNumbers("30", "3"));
    }

    @Test
    void squareRootBaseFourNumber() {
        assertEquals("2", calculator.squareRootBaseFourNumber("10"));
        assertEquals("10", calculator.squareRootBaseFourNumber("100"));
    }

    @Test
    void squareBaseFourNumber() {
        assertEquals( "10", calculator.squareBaseFourNumber("2"));
        assertEquals( "21", calculator.squareBaseFourNumber("3"));
    }

    @Test
    void invert() {
        assertEquals("-1", calculator.invert("1"));
        assertEquals("-333", calculator.invert("333"));
    }
}