package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

public class CalculatorController {
	boolean showBaseFourValue = true;
	Calculator calculator = new Calculator();


	@FXML
	private Label displayLabel;

	@FXML
	private ToggleGroup binaryOperators;


	@FXML
	protected void onDisplayToggle(){
		showBaseFourValue = !showBaseFourValue;
		displayLabel.setText(String.valueOf(showBaseFourValue));
	}

	@FXML
	protected void onNegativeButtonPress(){

	}
	private String calculateResult(String num1, String num2, String operator) {
		switch(operator) {
			case "+":
				return calculator.sumOfNumbers(num1, num2);
			case "-":
				return  calculator.differenceOfNumbers(num1, num2);
			case "/":
				return calculator.multiplicationOfNumbers(num1, num2);
			case "√":
				return calculator.squareRootBaseFourNumber(num1);
			case "^2":
				return calculator.squareBaseFourNumber(num1);
			default:
				return "try again";
		}
	}

	@FXML
	protected void onEqualsButtonPress(){

	}
}