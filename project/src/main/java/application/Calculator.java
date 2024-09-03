package application;

import java.lang.Math;

public class Calculator {
    public int convertBaseFourToBaseTen(String base4) {
        String radixConversion = Integer.toString(Integer.parseInt(base4, 4), 10)
        return Integer.parseInt(radixConversion);
    }

    public String convertBaseTenToBaseFour(int base10) {

    }

    public int sumOfNumbers(String num1, String num2, boolean isBase10) {
        if (isBase10) {
            Integer result = Integer.parseInt(num1) + Integer.parseInt(num2);
            return result;
        } else {
            String result = Integer.toString(convertBaseFourToBaseTen(num1) + convertBaseFourToBaseTen(num2));
            return result;
        }
    }

    public int differenceOfNumbers() {

    }

    public int multiplicationOfNumbers() {

    }

    public int divisionOfNumbers() {

    }

    public int squareRootOfNumber() {

    }

    public int squareOfNumber() {

    }

}
