package application;

import java.lang.Math;

public class Calculator {
    public QuaternaryInteger sumOfNumbers(QuaternaryInteger integer1, QuaternaryInteger integer2) {
        int value = integer1.getBaseTenValue() + integer2.getBaseTenValue();
        return new QuaternaryInteger(value);
    }

    public QuaternaryInteger differenceOfNumbers(QuaternaryInteger integer1, QuaternaryInteger integer2) {
        int value = integer1.getBaseTenValue() - integer2.getBaseTenValue();
        return new QuaternaryInteger(value);
    }

    public QuaternaryInteger multiplicationOfNumbers(QuaternaryInteger integer1, QuaternaryInteger integer2) {
        int value = integer1.getBaseTenValue() * integer2.getBaseTenValue();
        return new QuaternaryInteger(value);
    }

    public QuaternaryInteger divisionOfNumbers(QuaternaryInteger dividend, QuaternaryInteger divisor) {
        if (divisor.getBaseTenValue() == 0) throw new IllegalArgumentException("Can't divide by zero");
        int value = dividend.getBaseTenValue()/divisor.getBaseTenValue();
        return new QuaternaryInteger(value);
    }

    public QuaternaryInteger squareRootBaseFourNumber(QuaternaryInteger number) {
        int result = (int) Math.sqrt(number.getBaseTenValue());
        return new QuaternaryInteger(result);
    }

    public QuaternaryInteger squareBaseFourNumber(QuaternaryInteger number) {
        return multiplicationOfNumbers(number, number);
    }

}
