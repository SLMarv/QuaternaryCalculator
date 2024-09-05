package application;

import java.lang.Math;

public class Calculator {
    public int convertBaseFourToBaseTen(String base4) {
        String radixConversion = Integer.toString(Integer.parseInt(base4, 4), 10);
        return Integer.parseInt(radixConversion);
    }

    public String convertBaseTenToBaseFour(int base10) {
        return Integer.toString(base10, 4);
    }

    public int sumOfNumbers(String num1, String num2, boolean isBase10) {
        if (isBase10) {
            Integer result = Integer.parseInt(num1) + Integer.parseInt(num2);
            return result;
        } else {
            int result = convertBaseFourToBaseTen(num1) + convertBaseFourToBaseTen(num2);
            return result;
        }
    }

    public int differenceOfNumbers(String num1, String num2, boolean isBase10) {
        if (isBase10) {
            Integer result = Integer.parseInt(num1) - Integer.parseInt(num2);
            return result;
        } else {
            String result = Integer.toString(convertBaseFourToBaseTen(num1) - convertBaseFourToBaseTen(num2));
            return Integer.parseInt(result);
        }

    }

    public int multiplicationOfNumbers(String num1, String num2, boolean isBase10) {
        if (isBase10) {
            Integer result = Integer.parseInt(num1) * Integer.parseInt(num2);
            return result;
        } else {
            int result = convertBaseFourToBaseTen(num1) * convertBaseFourToBaseTen(num2);
            return result;
        }
    }

    public int divisionOfNumbers(String num1, String num2, boolean isBase10) {
        int divisor = isBase10 ? Integer.parseInt(num2) : convertBaseFourToBaseTen(num2);
        if (divisor == 0) throw new IllegalArgumentException("Can't divide by zero");
        if (isBase10) {
            Integer result = Integer.parseInt(num1) / divisor;
            return result;
        } else {
            int result = convertBaseFourToBaseTen(num1) / divisor;
            return result;
        }
    }

    public String squareRootBaseFourNumber(String number) {
        int result = (int) Math.sqrt(Integer.parseInt(number,4));
        return convertBaseTenToBaseFour(result);
    }

    public String squareBaseFourNumber(String baseFourNumber) {
        int value = Integer.parseInt(baseFourNumber,4);
        return convertBaseTenToBaseFour(value * value);
    }

}
