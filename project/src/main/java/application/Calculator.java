package application;

import java.lang.Math;

public class Calculator {
    public int toDecimal(String base4) {
        String radixConversion = Integer.toString(Integer.parseInt(base4, 4), 10);
        return Integer.parseInt(radixConversion);
    }

    public String toQuaternary(int base10) {
        return Integer.toString(base10, 4);
    }
//all calculations to be done in decimal - Cyrus
    public String sumOfNumbers(String num1, String num2) {
        int result = toDecimal(num1) + toDecimal(num2);
        return toQuaternary(result);
    }

    public String differenceOfNumbers(String num1, String num2) {
        int result = toDecimal(num1) - toDecimal(num2);
        return toQuaternary(result);
    }

    public String multiplicationOfNumbers(String num1, String num2) {
        int result = toDecimal(num1) * toDecimal(num2);
        return toQuaternary(result);
    }

    public String divisionOfNumbers(String num1, String num2) {
        int divisor = toDecimal(num2);
        if (divisor == 0) throw new IllegalArgumentException("Can't divide by zero");
        int result = toDecimal(num1) / divisor;
        return toQuaternary(result);
    }

    public String squareRootBaseFourNumber(String number) {
        int result = (int) Math.sqrt(toDecimal(number));
        return toQuaternary(result);
    }

    public String squareBaseFourNumber(String number) {
        int value = toDecimal(number);
        return toQuaternary(value * value);
    }

}
