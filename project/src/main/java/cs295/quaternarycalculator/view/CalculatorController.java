package cs295.quaternarycalculator.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController {
	boolean showBaseFourValue = true;

	@FXML
	private Label displayLabel;


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