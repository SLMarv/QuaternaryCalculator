package application;

import java.lang.Math;

public class Calculator {
    private int firstOperand = 0;
    private int secondOperand = 0;
    private BinaryOperation binaryOperation = null;
    private Integer result;

    public void concatenateToCurrentValue(String baseFourValue){
        if (result != null) {
            result = null;
            clear();
        }
        try{
            setCurrentValue(toDecimal(getCurrentQuaternaryValue() + baseFourValue));
        } catch (NumberFormatException _){}
    }

    public void clear(){
        firstOperand = 0;
        secondOperand = 0;
        binaryOperation = null;
    }

    public String negate(){
        setCurrentValue(getCurrentDecimalValue()*-1);
		return getCurrentQuaternaryValue();
	}

    public String calculate(){
        try{
            if(binaryOperation == null) return getCurrentQuaternaryValue();
            result = switch (binaryOperation){
				case MULTIPLICATION -> firstOperand * secondOperand;
				case DIVISION -> firstOperand / secondOperand;
				case ADDITION -> firstOperand + secondOperand;
				case SUBTRACTION -> firstOperand - secondOperand;
			};
            clear();
            firstOperand = result;
            return toQuaternary(result);
        } catch (ArithmeticException e) {
            clear();
            throw e;
        }
    }

    public void setBinaryOperation(BinaryOperation binaryOperation) {
        this.binaryOperation = binaryOperation;
    }

    public String getCurrentQuaternaryValue(){
        return toQuaternary(getCurrentDecimalValue());
    }

    void setCurrentValue(int newValue){
        if (binaryOperation==null) firstOperand = newValue;
        else secondOperand = newValue;
    }

    public int getCurrentDecimalValue(){
        if (result != null) return result;
        return (binaryOperation==null? firstOperand: secondOperand);
    }

    public int toDecimal(String base4) {
        String radixConversion = Integer.toString(Integer.parseInt(base4, 4), 10);
        return Integer.parseInt(radixConversion);
    }

    public String toQuaternary(int base10) {
        return Integer.toString(base10, 4);
    }

    public void squareRoot() {
        setCurrentValue((int) Math.sqrt(getCurrentDecimalValue()));
    }

    public void square() {
        int currentValue = getCurrentDecimalValue();
        setCurrentValue(currentValue * currentValue);

    }
}
