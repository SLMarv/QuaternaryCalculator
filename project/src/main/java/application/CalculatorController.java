package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

public class CalculatorController {
	boolean showBaseFourValue = true;

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

	@FXML
	protected void onEqualsButtonPress(){

	}
}