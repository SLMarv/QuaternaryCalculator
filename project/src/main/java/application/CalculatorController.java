package application;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class CalculatorController {
	public Button clearButton;
	Calculator calculator = new Calculator();


	@FXML private Label displayLabel;
	@FXML private GridPane gridPane;
	@FXML private ToggleButton baseToggle;

	@FXML
	private void initialize(){
		int numberValue = 0;
		for(int y = 1; y < 3; y++){
			for (int x = 0; x < 2; x++){
				Button numberButton = makeFormattedButton(String.valueOf(numberValue));
				int finalNumberValue = numberValue;
				numberButton.setOnAction(_ -> {
					calculator.concatenateToCurrentValue(String.valueOf(finalNumberValue));
					updateDisplay();
				});
				gridPane.add(numberButton,x,y);
				numberValue++;
			}
		}
		int rowCount = 0;
		for(BinaryOperation binaryOperation : BinaryOperation.values()){
			Button operationButton = makeFormattedButton(binaryOperation.getSymbol());
			operationButton.setOnAction(_ -> calculator.setBinaryOperation(binaryOperation));
			gridPane.add(operationButton, 2, rowCount);
			rowCount++;
		}
	}

	private Button makeFormattedButton(String text){
		Button button = new Button(text);
		button.setPrefSize(600,600);
		return button;
	}

	@FXML
	protected void onDisplayToggle(){
		updateDisplay();
	}

	@FXML
	protected void onNegativeButtonPress(){
		calculator.negate();
		updateDisplay();
	}

	@FXML
	protected void onEqualsButtonPress(){
		try {
			calculator.calculate();
			updateDisplay();
		} catch (ArithmeticException e) {
			displayLabel.setText("Undefined: press clear to reset");
			gridPane.setDisable(true);
			baseToggle.setDisable(true);
		}
	}

	@FXML
	public void onSquareButtonPress() {
		calculator.square();
		updateDisplay();
	}

	@FXML
	public void onSquareRootButtonPress() {
		calculator.squareRoot();
		updateDisplay();
	}

	private void updateDisplay(){
		displayLabel.setText(baseToggle.isSelected()? String.valueOf(calculator.getCurrentDecimalValue()) : calculator.getCurrentQuaternaryValue());
	}

	public void onClearButtonPress() {
		calculator.clear();
		gridPane.setDisable(false);
		baseToggle.setDisable(false);
		updateDisplay();
	}
}