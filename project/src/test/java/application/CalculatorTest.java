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
        assertEquals(3, calculator.toDecimal("3"));
        assertEquals(4, calculator.toDecimal("10"));
        assertEquals(15, calculator.toDecimal("33"));
        assertEquals(63, calculator.toDecimal("333"));
        assertEquals(255, calculator.toDecimal("3333"));
        assertEquals(21, calculator.toDecimal("111"));
    }

    @Test
    void toQuaternary() {
        assertEquals("0", calculator.toQuaternary(0));
        assertEquals("1", calculator.toQuaternary(1));
        assertEquals("2", calculator.toQuaternary(2));
        assertEquals("3", calculator.toQuaternary(3));
        assertEquals("10", calculator.toQuaternary(4));
        assertEquals("33", calculator.toQuaternary(15));
        assertEquals("333", calculator.toQuaternary(63));
        assertEquals("3333", calculator.toQuaternary(255));
        assertEquals("111", calculator.toQuaternary(21));
    }

    @Test
    void sumOperation() {
        calculator.concatenateToCurrentValue("2");
        calculator.setBinaryOperation(BinaryOperation.ADDITION);
        calculator.concatenateToCurrentValue("2");
        assertEquals("10", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("11");
        calculator.setBinaryOperation(BinaryOperation.ADDITION);
        calculator.concatenateToCurrentValue("1");
        assertEquals("12", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("30");
        calculator.setBinaryOperation(BinaryOperation.ADDITION);
        calculator.concatenateToCurrentValue("3");
        assertEquals("33", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("333");
        calculator.setBinaryOperation(BinaryOperation.ADDITION);
        calculator.concatenateToCurrentValue("1");
        assertEquals("1000", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("111");
        calculator.setBinaryOperation(BinaryOperation.ADDITION);
        calculator.concatenateToCurrentValue("2");
        assertEquals("113", calculator.calculate());
        calculator.clear();
    }

    @Test
    void subtractionOperation() {
        calculator.concatenateToCurrentValue("10");
        calculator.setBinaryOperation(BinaryOperation.SUBTRACTION);
        calculator.concatenateToCurrentValue("1");
        assertEquals("3", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("20");
        calculator.setBinaryOperation(BinaryOperation.SUBTRACTION);
        calculator.concatenateToCurrentValue("10");
        assertEquals("10", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("333");
        calculator.setBinaryOperation(BinaryOperation.SUBTRACTION);
        calculator.concatenateToCurrentValue("1");
        assertEquals("332", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("100");
        calculator.setBinaryOperation(BinaryOperation.SUBTRACTION);
        calculator.concatenateToCurrentValue("11");
        assertEquals("13", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("21");
        calculator.setBinaryOperation(BinaryOperation.SUBTRACTION);
        calculator.concatenateToCurrentValue("11");
        assertEquals("10", calculator.calculate());
        calculator.clear();
    }

    @Test
    void multiplicationOperation() {
        calculator.concatenateToCurrentValue("3");
        calculator.setBinaryOperation(BinaryOperation.MULTIPLICATION);
        calculator.concatenateToCurrentValue("3");
        assertEquals("21", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("2");
        calculator.setBinaryOperation(BinaryOperation.MULTIPLICATION);
        calculator.concatenateToCurrentValue("2");
        assertEquals("10", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("12");
        calculator.setBinaryOperation(BinaryOperation.MULTIPLICATION);
        calculator.concatenateToCurrentValue("3");
        assertEquals("110", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("111");
        calculator.setBinaryOperation(BinaryOperation.MULTIPLICATION);
        calculator.concatenateToCurrentValue("2");
        assertEquals("222", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("30");
        calculator.setBinaryOperation(BinaryOperation.MULTIPLICATION);
        calculator.concatenateToCurrentValue("10");
        assertEquals("300", calculator.calculate());
        calculator.clear();
    }

    @Test
    void divisionOperation() {
        calculator.concatenateToCurrentValue("10");
        calculator.setBinaryOperation(BinaryOperation.DIVISION);
        calculator.concatenateToCurrentValue("2");
        assertEquals("2", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("30");
        calculator.setBinaryOperation(BinaryOperation.DIVISION);
        calculator.concatenateToCurrentValue("3");
        assertEquals("10", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("100");
        calculator.setBinaryOperation(BinaryOperation.DIVISION);
        calculator.concatenateToCurrentValue("10");
        assertEquals("10", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("111");
        calculator.setBinaryOperation(BinaryOperation.DIVISION);
        calculator.concatenateToCurrentValue("21");
        assertEquals("2", calculator.calculate());
        calculator.clear();

        calculator.concatenateToCurrentValue("333");
        calculator.setBinaryOperation(BinaryOperation.DIVISION);
        calculator.concatenateToCurrentValue("3");
        assertEquals("111", calculator.calculate());
        calculator.clear();
    }

    @Test
    void squareRoot() {
        calculator.concatenateToCurrentValue("100");
        calculator.squareRoot();
        assertEquals("10", calculator.getCurrentQuaternaryValue());
        calculator.clear();

        calculator.concatenateToCurrentValue("21");
        calculator.squareRoot();
        assertEquals("11", calculator.getCurrentQuaternaryValue());
        calculator.clear();

        calculator.concatenateToCurrentValue("1000");
        calculator.squareRoot();
        assertEquals("20", calculator.getCurrentQuaternaryValue());
        calculator.clear();

        calculator.concatenateToCurrentValue("121");
        calculator.squareRoot();
        assertEquals("11", calculator.getCurrentQuaternaryValue());
        calculator.clear();

        calculator.concatenateToCurrentValue("110");
        calculator.squareRoot();
        assertEquals("12", calculator.getCurrentQuaternaryValue());
        calculator.clear();
    }

    @Test
    void square() {
        calculator.concatenateToCurrentValue("3");
        calculator.square();
        assertEquals("21", calculator.getCurrentQuaternaryValue());
        calculator.clear();

        calculator.concatenateToCurrentValue("2");
        calculator.square();
        assertEquals("10", calculator.getCurrentQuaternaryValue());
        calculator.clear();

        calculator.concatenateToCurrentValue("10");
        calculator.square();
        assertEquals("100", calculator.getCurrentQuaternaryValue());
        calculator.clear();

        calculator.concatenateToCurrentValue("111");
        calculator.square();
        assertEquals("11121", calculator.getCurrentQuaternaryValue());
        calculator.clear();

        calculator.concatenateToCurrentValue("30");
        calculator.square();
        assertEquals("1200", calculator.getCurrentQuaternaryValue());
        calculator.clear();
    }

    @Test
    void invert() {
//        assertEquals("-1", calculator.invert("1"));
//        assertEquals("-333", calculator.invert("333"));
    }
}
